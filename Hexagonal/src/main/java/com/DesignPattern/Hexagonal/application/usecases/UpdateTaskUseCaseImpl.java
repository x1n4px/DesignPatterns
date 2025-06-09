package com.DesignPattern.Hexagonal.application.usecases;

import com.DesignPattern.Hexagonal.domain.model.Task;
import com.DesignPattern.Hexagonal.domain.ports.in.UpdateTaskUseCase;
import com.DesignPattern.Hexagonal.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepositoryPort.update(updatedTask);
    }
}