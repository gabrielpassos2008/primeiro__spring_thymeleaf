package com.example.primeiro_thymeleaf.model;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class Task {

    private Long id;
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime date;

    // Construtor vazio (obrigatório para o Spring)
    public Task() {
    }

    // Construtor completo
    public Task(Long id, String name, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    // Get
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    // Set
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
