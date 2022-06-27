package designpatterns.structural.adapter.payu;

public class PayUGateway {
    public String makeCCPayment(Long creditCard,
                                  Long cvv,
                                  Long expiry) {
        System.out.println("Payment Done by Razorpay");
        return "123";
    }

    public PayUPaymentStatus checkPaymentStatus(String id) {
        return PayUPaymentStatus.FAILURE;
    }
}
