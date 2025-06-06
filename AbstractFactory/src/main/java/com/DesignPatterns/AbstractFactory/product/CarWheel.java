package com.DesignPatterns.AbstractFactory.product;


import org.springframework.stereotype.Component;

@Component
public class CarWheel implements Wheel{
    @Override
    public String getMaterial() {
        return "Rueda de Coche (Aleación)";
    }
}
