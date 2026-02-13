package com.example.primeiro_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.primeiro_thymeleaf.model.Task;

@Controller
public class TaskController {

    @GetMapping("/create")
    public String getCreate() {
        return "create";
    }

    @PostMapping("/create")
    public void postCreate(Task task) {
        System.out.println("o nome da terafa e: " + task.getName());
    }
}
