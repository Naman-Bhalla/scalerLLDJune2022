package designpatterns.structural.adapter;

import java.util.List;

public class Flipkart {
    private PaymentGateway paymentGateway;

    private PaymentGateway chooseBestGateway() {
        return null;
    }
    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(String cardNumber,
                                 int cvv,
                                 int expiryMonth,
                                 int expiryYear) {

        Long transactionId = paymentGateway.payViaCC(
                cardNumber,
                cvv,
                expiryMonth,
                expiryYear
        );

        while (!paymentGateway.getStatus(transactionId)
                .equals(PaymentStatus.SUCCESS)) {
            System.out.println("Waiting");
        }
    }
}
