package payoneer;

import utils.Token;

public class Payoneer implements IPayoneerPayments{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamento via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via Payoneer");
    }
}
