package com.DesignPattern.Hexagonal.domain.ports.in;

import com.DesignPattern.Hexagonal.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
