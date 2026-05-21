package Decorator;

public class CheeseDecorator extends FoodDecorator {

    public CheeseDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public String getDescription() {
        return decoratedFood.getDescription() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return decoratedFood.getPrice() + 3;
    }
}