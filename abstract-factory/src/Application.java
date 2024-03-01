import factories.ITransportLandAirFactory;
import factories.ITransportSeaFactory;

public class Application {

    private ITransportLandAirFactory landAirFactory;
    private ITransportSeaFactory seaFactory;

    public Application(ITransportLandAirFactory factory){
        this.landAirFactory = factory;
    }

    public Application(ITransportSeaFactory factory){
        this.seaFactory = factory;
    }
}
