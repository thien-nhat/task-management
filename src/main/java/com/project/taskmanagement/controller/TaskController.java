package com.project.taskmanagement.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.taskmanagement.model.Entities.Task;
import com.project.taskmanagement.model.Service.TaskService;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SecurityScheme(type = SecuritySchemeType.HTTP, scheme = "bearer", name = "Authorization")  @SecurityRequirement(name = "AUTHORIZATION")
@RestController
@RequestMapping("/tasks")
public class TaskController {
	private TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	@GetMapping
	public List<Task> getAllTasks() {
		return this.taskService.getAllTasks();
	}

	@GetMapping("/{taskId}")
	public Task getTaskById(@PathVariable("taskId") Integer taskId) {
		return this.taskService.getTaskById(taskId);
	}

	@PostMapping
	public ResponseEntity<Task> createNewTask(@RequestBody Task task) {
		// this.checkValidTask(task);
		Task createdTask = this.taskService.createTask(task);
		return ResponseEntity.ok(createdTask);
	}

	@PutMapping("/{taskId}")
	public ResponseEntity<Task> updateTask(@RequestBody Task task, @PathVariable("taskId") Integer taskId) {
		// this.checkValidTask(task);
		Task updatedTask = this.taskService.updateTask(task, taskId);
		return ResponseEntity.ok(updatedTask);
	}

	@DeleteMapping("/{taskId}")
	public void deleteTask(@PathVariable("taskId") Integer taskId) {
		this.taskService.deleteTaskById(taskId);
	}
}
