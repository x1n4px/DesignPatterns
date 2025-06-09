package com.DesignPattern.Hexagonal.application.usecases;

import com.DesignPattern.Hexagonal.domain.model.Task;
import com.DesignPattern.Hexagonal.domain.ports.in.CreateTaskUseCase;
import com.DesignPattern.Hexagonal.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}