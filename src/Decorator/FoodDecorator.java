package Decorator;

public abstract class FoodDecorator implements Food {

    protected Food decoratedFood;

    public FoodDecorator(Food decoratedFood) {
        this.decoratedFood = decoratedFood;
    }
}