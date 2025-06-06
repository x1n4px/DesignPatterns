package com.DesignPatterns.AbstractFactory.factory;

import com.DesignPatterns.AbstractFactory.product.CarEngine;
import com.DesignPatterns.AbstractFactory.product.CarWheel;
import com.DesignPatterns.AbstractFactory.product.Engine;
import com.DesignPatterns.AbstractFactory.product.Wheel;
import org.springframework.stereotype.Component;

@Component("carFactory")
public class CarFactory implements VehicleFactory{
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Wheel createWheel() {
        return new CarWheel();
    }
}
