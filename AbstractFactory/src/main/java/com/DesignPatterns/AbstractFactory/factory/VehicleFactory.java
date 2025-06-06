package com.DesignPatterns.AbstractFactory.factory;

import com.DesignPatterns.AbstractFactory.product.Engine;
import com.DesignPatterns.AbstractFactory.product.Wheel;

public interface VehicleFactory {
    Engine createEngine();
    Wheel createWheel();
}
