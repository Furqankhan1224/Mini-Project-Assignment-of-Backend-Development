package com.test.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Task {
	@Id
    private Long id; // Unique identifier for the task
    private String taskName; // Name of the task
    private String description; // Description of the task
    private Date dueDate; // Due date of the task
    private TaskStatus status; // Status of the task (e.g., open, in progress, completed)

    // Constructors
    public Task() {
        // Default constructor
    }

    public Task(String taskName, String description, Date dueDate, TaskStatus status) {
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}

enum TaskStatus {
    OPEN,       // Task is open
    IN_PROGRESS, // Task is in progress
    COMPLETED   // Task is completed
}
