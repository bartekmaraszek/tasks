package com.thestardeveloper.tasks.repository;

import com.thestardeveloper.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
