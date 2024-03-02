package com.project.taskmanagement.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.taskmanagement.model.Entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	

}