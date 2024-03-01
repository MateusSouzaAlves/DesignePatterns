package app;

import airvehicles.IAirVehicles;
import factories.ITransportLandAirFactory;
import factories.ITransportSeaFactory;
import landvehicles.ILandVehicleInterface;
import seavehicles.ISeaVehicles;

public class Application {
    private ILandVehicleInterface vehicle;
    private IAirVehicles airVehicle;

    private ISeaVehicles seaVehicle;

    public Application(ITransportLandAirFactory factory){
        vehicle = factory.createTransportVehicle();
        airVehicle = factory.createTransportAir();
    }

    public Application(ITransportSeaFactory seaFactory) {
        seaVehicle = seaFactory.creatTransportSea();

    }

    public void startRoute() {
        if (vehicle != null) {
            vehicle.startRoute();
        }
        if (airVehicle != null) {
            airVehicle.startRoute();
        }
        if (seaVehicle != null) {
            seaVehicle.startRoute();
        }
    }
}
