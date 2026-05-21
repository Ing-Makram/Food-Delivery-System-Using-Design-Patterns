package Strategy;

public class StandardDelivery implements DeliveryStrategy {

    @Override
    public double calculateDeliveryFee() {
        return 5;
    }
}