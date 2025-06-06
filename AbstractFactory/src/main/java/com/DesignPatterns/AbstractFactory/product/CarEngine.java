package com.DesignPatterns.AbstractFactory.product;

import org.springframework.stereotype.Component;

@Component
public class CarEngine implements Engine{
    @Override
    public String getType() {
        return "Motor de Coche (Gasolina)";
    }
}
