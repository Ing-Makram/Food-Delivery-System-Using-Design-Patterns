package Adapter;

public class PayPalAdapter implements PaymentProcessor {

    private PayPalAPI paypal = new PayPalAPI();

    @Override
    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}