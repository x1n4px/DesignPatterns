package com.DesignPattern.Hexagonal.domain.ports.in;

import com.DesignPattern.Hexagonal.domain.model.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updatedTask);
}
