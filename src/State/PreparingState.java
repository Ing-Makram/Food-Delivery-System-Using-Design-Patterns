package State;

public class PreparingState implements OrderState {

    @Override
    public void handle() {
        System.out.println("Order is being prepared...");
    }
}