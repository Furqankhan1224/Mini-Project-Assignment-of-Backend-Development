package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}

