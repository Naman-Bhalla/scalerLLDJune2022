package designpatterns.structural.adapter;

// rp -> cc, dc, paytm
// juspay -> mobikwik, airtel money, cc, dc -> 1000
// payu

public interface PaymentGateway {

    Long payViaCC(String cardNumber,
                  int cvv,
                  int expiryMonth,
                  int expiryYear);

    PaymentStatus getStatus(Long id);



//    Long payViaDC()
}
