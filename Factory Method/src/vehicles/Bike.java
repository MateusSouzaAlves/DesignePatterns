package vehicles;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega de Bike");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda.");
    }
}
