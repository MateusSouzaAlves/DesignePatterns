import adapters.MercadoPagoAdapter;
import adapters.PayoneerAdapter;
import mercadopago.MercadoPago;
import payoneer.IPayoneerPayments;
import payoneer.Payoneer;
import paypal.IPaypalPayments;
import paypal.Paypal;

public class Main {
    public static void main(String[] args) {
        IPaypalPayments payments = new MercadoPagoAdapter(new MercadoPago());
        payments.paypalPayment();
        payments.paypalReceive();
    }
}