package com.thestardeveloper.tasks;

import com.thestardeveloper.tasks.domain.Task;
import com.thestardeveloper.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.save(new Task(1L, "Create a Spring App", LocalDate.now(), true));
			taskService.save(new Task(2L, "Learn Angular", LocalDate.now(), false));
			taskService.save(new Task(3L, "Grocery Shopping", LocalDate.now(), false));
			taskService.save(new Task(4L, "Cook a lot of food", LocalDate.now(), false));
			taskService.save(new Task(5L, "Date withh N.", LocalDate.now(), false));
			taskService.save(new Task(6L, "Leetcode tasks", LocalDate.now(), false));
		};
	}
}
