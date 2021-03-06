package com.thestardeveloper.tasks.service;

import com.thestardeveloper.tasks.domain.Task;
import com.thestardeveloper.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> listTasks() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

}
