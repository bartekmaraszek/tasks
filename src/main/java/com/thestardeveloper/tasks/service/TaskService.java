package com.thestardeveloper.tasks.service;

import com.thestardeveloper.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> listTasks();
    Task save(Task task);
}
