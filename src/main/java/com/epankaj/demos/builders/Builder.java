package com.epankaj.demos.builders;

import com.epankaj.demos.components.Engine;
import com.epankaj.demos.components.GPSNavigator;
import com.epankaj.demos.components.Transmission;
import com.epankaj.demos.components.TripComputer;
import com.epankaj.demos.components.cars.CarType;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
