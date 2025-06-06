package com.DesignPatterns.AbstractFactory.product;

import org.springframework.stereotype.Component;

@Component
public class MotorcycleEngine implements Engine{
    @Override
    public String getType() {
        return "Motor de Moto (2 Tiempos)";
    }
}
