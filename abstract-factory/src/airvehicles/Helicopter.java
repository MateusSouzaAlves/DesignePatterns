package airvehicles;

public class Helicopter implements IAirVehicles{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, ligando hélices");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25 km/h, ventos oks");
    }
}
