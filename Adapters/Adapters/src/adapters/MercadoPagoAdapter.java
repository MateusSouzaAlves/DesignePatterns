package adapters;

import mercadopago.MercadoPago;
import paypal.IPaypalPayments;
import utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago usando os métodos de pagamento do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPaymentMP();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePaymentMP();
    }
}
