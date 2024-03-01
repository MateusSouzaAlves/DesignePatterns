package builder.director;

import builder.builders.IBuilder;
import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public class Director {
    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(13000));
    }

    public void constructorSportCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(4000));
        builder.setColor(Color.BLACK);
    }
}
