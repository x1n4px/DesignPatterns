package com.DesignPattern.Hexagonal.domain.ports.in;

import com.DesignPattern.Hexagonal.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
