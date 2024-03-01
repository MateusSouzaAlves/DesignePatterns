package airvehicles;

public class Airplane implements IAirVehicles{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, vôo autorizado.");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25 km/h, ventos ok.");
    }
}
