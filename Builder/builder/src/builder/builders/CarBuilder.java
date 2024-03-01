package builder.builders;

import cars.Car;
import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public class CarBuilder  implements IBuilder{

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Color color;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Car getResult(){
        return new Car(carType,seats,engine,transmission, color);
    }
}
