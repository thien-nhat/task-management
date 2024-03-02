package com.project.taskmanagement.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taskmanagement.model.Entities.Task;
import com.project.taskmanagement.model.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    // Integer này với int thì nên xài cái nào?
    public Task getTaskById(Integer id) {

        return taskRepository.findById(id).get();

    }

    public Task createTask(Task task) {
        return this.taskRepository.save(task);
    }

    public Task updateTask(Task task, Integer id) {
        // Optional<Task> optionalTask = this.taskRepository.findById(id);
        // if (optionalTask.isEmpty()) {
        // throw new ObjectNotFoundException(String.format("Can't find task with id %d",
        // id));
        // }
        task.setId(id);
        return this.taskRepository.save(task);
    }

    public void deleteTaskById(Integer id) {
        this.taskRepository.deleteById(id);
    }
}