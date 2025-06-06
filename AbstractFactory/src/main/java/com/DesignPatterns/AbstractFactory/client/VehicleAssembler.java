package com.DesignPatterns.AbstractFactory.client;

import com.DesignPatterns.AbstractFactory.factory.VehicleFactory;
import com.DesignPatterns.AbstractFactory.product.Engine;
import com.DesignPatterns.AbstractFactory.product.Wheel;
import org.springframework.stereotype.Component;

public class VehicleAssembler {
    private final VehicleFactory vehicleFactory;


    // Inyección de dependencia de la fábrica a través del constructor
    // Spring decidirá qué implementación de VehicleFactory inyectar
    // Si hay múltiples, necesitaríamos @Qualifier
    public VehicleAssembler(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public String assembleVehicle() {
        Engine engine = vehicleFactory.createEngine();
        Wheel wheel = vehicleFactory.createWheel();

        return "Vehiculo ensamblado con: " + engine.getType() + " y " + wheel.getMaterial();
    }
}
