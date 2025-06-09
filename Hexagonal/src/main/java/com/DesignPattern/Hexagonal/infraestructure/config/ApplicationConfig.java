package com.DesignPattern.Hexagonal.infraestructure.config;

import com.DesignPattern.Hexagonal.application.service.TaskService;
import com.DesignPattern.Hexagonal.application.usecases.*;
import com.DesignPattern.Hexagonal.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.DesignPattern.Hexagonal.domain.ports.out.ExternalServicePort;
import com.DesignPattern.Hexagonal.domain.ports.out.TaskRepositoryPort;
import com.DesignPattern.Hexagonal.infraestructure.adapters.ExternalServiceAdapter;
import com.DesignPattern.Hexagonal.infraestructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
