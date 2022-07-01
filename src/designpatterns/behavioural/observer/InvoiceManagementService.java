package designpatterns.behavioural.observer;

import java.util.concurrent.Flow;

public class InvoiceManagementService implements Subscriber<Order> {

    InvoiceManagementService() {
//        Flipkart.registerSubscriber(Events.ORDER_PLACED, this);
//        Flipkart.registerSubscriber(Events.ORDER_CANCELLED, this);
    }

    @Override
    public void listen(Events event, Order order) {
        if (event == Events.ORDER_PLACED) {
            generateInvoice(order);
        } else {
            cancelInvoice(order);
        }
    }

    public void generateInvoice(Order order) {
        System.out.println("Generating invoice for order");
    }

    public void cancelInvoice(Order order) {
        System.out.println("Cancelling Invoice");
    }
}
