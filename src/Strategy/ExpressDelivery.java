package Strategy;

public class ExpressDelivery implements DeliveryStrategy {

    @Override
    public double calculateDeliveryFee() {
        return 15;
    }
}