package factories;

import airvehicles.Airplane;
import airvehicles.IAirVehicles;
import landvehicles.Car;
import landvehicles.ILandVehicleInterface;

public class UberTransportLandAir implements ITransportLandAirFactory {
    @Override
    public ILandVehicleInterface createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirVehicles createTransportAir() {
        return new Airplane();
    }
}
