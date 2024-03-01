package seavehicles;

public class Boat implements ISeaVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando navegação");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros embarcaram");
    }
}
