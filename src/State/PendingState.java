package State;

public class PendingState implements OrderState {

    @Override
    public void handle() {
        System.out.println("Order is pending...");
    }
}