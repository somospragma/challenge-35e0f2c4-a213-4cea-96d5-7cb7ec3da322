package com.example.taskmanager.application;

import com.example.taskmanager.domain.Task;
import com.example.taskmanager.infrastructure.TaskRepository;
import org.springframework.stereotype.Component;

@Component
public class TaskCreator {
    private final TaskRepository taskRepository;

    public TaskCreator(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(String title, String description) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(false);
        return taskRepository.save(task);
    }
}