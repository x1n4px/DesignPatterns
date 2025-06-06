package com.DesignPatterns.AbstractFactory.product;

import org.springframework.stereotype.Component;

@Component
public class MotorcycleWheel implements Wheel{
    @Override
    public String getMaterial() {
        return "Rueda de Moto (Caucho reforzado)";
    }
}
