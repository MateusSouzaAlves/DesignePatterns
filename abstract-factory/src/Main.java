import app.Application;
import factories.*;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportLandAirFactory factory ;
        ITransportSeaFactory seaFactory;

        String company = "boat";

        if (company.equals("uber")){
            factory = new UberTransportLandAir();
            app = new Application(factory);
        }else if (company.equals("boat")){
            seaFactory = new BoatTransportSea();
            app = new Application(seaFactory);
        }else {
            factory = new NineNineTransportLandAir();
            app = new Application(factory);
        }

        return app;
    }


    public static void main(String[] args) {
        Application app = configureApplication();
                app.startRoute();
    }
}