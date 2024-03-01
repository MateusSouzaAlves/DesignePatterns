package platforms;

public class TwichTV implements IPlatform{
    public TwichTV(){
        configureRMTP();
        System.out.println("TwichTV: Transmissão Iniciada ");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwichTV: Conta autorizada");

    }

    @Override
    public void authToken() {
        System.out.println("TwichTV: Autorizando Aplicação");
    }
}
