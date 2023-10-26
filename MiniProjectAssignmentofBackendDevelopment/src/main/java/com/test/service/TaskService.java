package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Task;
import com.test.repo.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Create a new task
    public Task createTask(Task task) {
        // Implement validation and error handling if needed
        return taskRepository.save(task);
    }


    public Task getTask(Long taskId) {
        
        return taskRepository.findById(taskId).orElse(null);
    }

    
    public Task updateTask(Long taskId, Task updatedTask) {

        Task existingTask = taskRepository.findById(taskId).orElse(null);
        if (existingTask != null) {
            
            existingTask.setTaskName(updatedTask.getTaskName());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setDueDate(updatedTask.getDueDate());
            existingTask.setStatus(updatedTask.getStatus());

            return taskRepository.save(existingTask);
        }
        return null;
    }

 
    public void deleteTask(Long taskId) {
       
        taskRepository.deleteById(taskId);
    }

    
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}

