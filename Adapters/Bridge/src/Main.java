import platforms.Facebook;
import platforms.IPlatform;
import platforms.TwichTV;
import platforms.Youtube;
import transmissions.Live;

public class Main {
    public static void main(String[] args) {
    startLive(new TwichTV());

    }

    public static void startLive(IPlatform platform){
        System.out.println("Aguarde...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }
}