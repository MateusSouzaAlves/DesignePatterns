package builder.builders;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmission;

public interface IBuilder {
    void setCarType (CarType type);
    void setSeats ( int seats);
    void setTransmission (Transmission transmission);
    void setEngine (Engine engine);
    void setColor (Color color);
}
