package designpatterns.structural.adapter;

import designpatterns.structural.adapter.razorpay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter
implements PaymentGateway {
    private RazorpayGateway razorpayGateway = new RazorpayGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = String.valueOf(expiryMonth) + "/" + String.valueOf(expiryYear);

        String answer = razorpayGateway.payByCreditCard(cardNumber, cvvString, expiry);

        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {

        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(id));

        if (status == true) {
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.FAILURE;
    }
}
