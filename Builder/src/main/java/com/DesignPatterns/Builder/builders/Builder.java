package com.DesignPatterns.Builder.builders;

import com.DesignPatterns.Builder.cars.CarType;
import com.DesignPatterns.Builder.components.Engine;
import com.DesignPatterns.Builder.components.GPSNavigator;
import com.DesignPatterns.Builder.components.Transmission;
import com.DesignPatterns.Builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
