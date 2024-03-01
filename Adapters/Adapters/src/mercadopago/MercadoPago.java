package mercadopago;

import utils.Token;

public class MercadoPago implements IMercadoPago{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPaymentMP() {
        System.out.println("Enviando pagamento via Mercado Pago");
    }

    @Override
    public void receivePaymentMP() {
        System.out.println("Recebendo pagamento via Mercado Pago");
    }
}
