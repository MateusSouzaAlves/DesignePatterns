package factories;

import seavehicles.Boat;
import seavehicles.ISeaVehicles;

public class BoatTransportSea implements ITransportSeaFactory {

    @Override
    public ISeaVehicles creatTransportSea() {
        return new Boat();
    }
}
