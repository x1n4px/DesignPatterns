package com.DesignPattern.Hexagonal.domain.ports.in;

import com.DesignPattern.Hexagonal.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTaskById(Long id);
    List<Task> getAllTasks();
}
