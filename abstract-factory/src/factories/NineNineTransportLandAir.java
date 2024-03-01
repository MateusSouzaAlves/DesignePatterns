package factories;

import airvehicles.Helicopter;
import airvehicles.IAirVehicles;
import landvehicles.ILandVehicleInterface;
import landvehicles.Motorcycle;

public class NineNineTransportLandAir implements ITransportLandAirFactory {
    @Override
    public ILandVehicleInterface createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAirVehicles createTransportAir() {
        return new Helicopter();
    }
}
