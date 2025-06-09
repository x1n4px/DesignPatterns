package com.DesignPattern.Hexagonal.domain.ports.out;

import com.DesignPattern.Hexagonal.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
