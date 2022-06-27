package designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter());


    }

    // Assignment
    // 1. Implement PayUAdapter and use with FLipkart
    // 2. Implement Billdesk Codebase and adapter for the same
}
