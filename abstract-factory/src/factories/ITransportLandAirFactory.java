package factories;

import airvehicles.IAirVehicles;
import landvehicles.ILandVehicleInterface;

public interface ITransportLandAirFactory {
    ILandVehicleInterface createTransportVehicle();
    IAirVehicles createTransportAir();
}
