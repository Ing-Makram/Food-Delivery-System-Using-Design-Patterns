package Factory;

public class PaymentFactory {

    public static Payment createPayment(String type) {

        if(type.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }

        if(type.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        }

        return null;
    }
}