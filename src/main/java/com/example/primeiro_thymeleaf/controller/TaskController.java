package com.example.primeiro_thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.primeiro_thymeleaf.model.Task;

@Controller
public class TaskController {

    List<Task> tasks = new ArrayList<>();

    @GetMapping("/create")
    public String getCreate() {
        return "create";
    }

    @PostMapping("/create")
    public String postCreate(Task task) {
        Long id = tasks.size() + 1L;
        tasks.add(new Task(id, task.getName(), task.getDate()));
        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView getList() {
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("tasks", tasks);
        return mv;
    }
}
