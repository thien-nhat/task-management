package com.project.taskmanagement.model.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    private Integer id;
    private String title;
    private String content;
    private Boolean completed;

    public Task() {
    }
    public Task(Integer id, String title, String content, Boolean completed) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.completed = completed;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Boolean getCompleted() {
        return completed;
    }
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
}
