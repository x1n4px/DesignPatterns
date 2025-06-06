package com.DesignPatterns.AbstractFactory.factory;

import com.DesignPatterns.AbstractFactory.product.Engine;
import com.DesignPatterns.AbstractFactory.product.MotorcycleEngine;
import com.DesignPatterns.AbstractFactory.product.MotorcycleWheel;
import com.DesignPatterns.AbstractFactory.product.Wheel;
import org.springframework.stereotype.Component;

@Component("motorcycleFactory")
public class MotorcycleFactory implements VehicleFactory
{
    @Override
    public Engine createEngine() {
        return new MotorcycleEngine();
    }

    @Override
    public Wheel createWheel() {
        return new MotorcycleWheel();
    }
}
