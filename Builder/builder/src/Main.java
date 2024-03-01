import builder.builders.CarBuilder;
import builder.builders.TruckBuilder;
import builder.director.Director;
import cars.Car;
import cars.Truck;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder =  new CarBuilder();
        director.constructSedanCar(builder);



        TruckBuilder truckBuilder =  new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck =  truckBuilder.getResult();
        System.out.println("Caminhão: " + (truck.result()));

        CarBuilder sportCarBuilder = new CarBuilder();
        director.constructorSportCar(sportCarBuilder);

        Car sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.getCarType() + " Produzido com sucesso. ");
        System.out.println(sportCar.getResult());
    }
}