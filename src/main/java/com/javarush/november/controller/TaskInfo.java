package com.javarush.november.controller;

import com.javarush.november.domain.Status;

public class TaskInfo { // DTO
    private String description;
    private Status status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
