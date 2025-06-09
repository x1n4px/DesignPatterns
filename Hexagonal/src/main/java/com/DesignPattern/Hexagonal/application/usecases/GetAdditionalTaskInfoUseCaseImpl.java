package com.DesignPattern.Hexagonal.application.usecases;

import com.DesignPattern.Hexagonal.domain.model.AdditionalTaskInfo;
import com.DesignPattern.Hexagonal.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.DesignPattern.Hexagonal.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}