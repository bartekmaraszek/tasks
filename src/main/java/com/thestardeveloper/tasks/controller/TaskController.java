package com.thestardeveloper.tasks.controller;

import com.thestardeveloper.tasks.domain.Task;
import com.thestardeveloper.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> listTasks() {
        return this.taskService.listTasks();
    }

    @PostMapping(value = {"/save"})
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
