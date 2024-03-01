package paypal;

import utils.Token;

public interface IPaypalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
