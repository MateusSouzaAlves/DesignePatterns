package cars;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public class Car {

    private final CarType carType;
    private final int seat;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, Color color){
        this.carType = carType;
        this.seat = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeat() {
        return seat;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Color getColor() {
        return color;
    }

    public String getResult(){
        String car = "Car with motor : " + engine.getPower() +
                "\n transmission: " + transmission +
                "\n color : " + color;
        return car;
    }
}
