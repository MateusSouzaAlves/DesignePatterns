package cars;

import components.CarType;
import components.Engine;
import components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seat;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission){
        this.carType = carType;
        this.seat = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result (){
        String truck = "Truck with motor" + engine.getPower() + "\n";
        truck += "Transmission: " + transmission;

        return truck;
    }
}
