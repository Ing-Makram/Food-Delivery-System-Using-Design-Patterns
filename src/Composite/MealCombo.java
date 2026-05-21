package Composite;

import java.util.ArrayList;
import java.util.List;

public class MealCombo extends FoodComponent {

    private String name;
    private List<FoodComponent> items = new ArrayList<>();

    public MealCombo(String name) {
        this.name = name;
    }

    public void addItem(FoodComponent item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;

        for (FoodComponent item : items) {
            total += item.getPrice();
        }

        return total;
    }

    @Override
    public String getName() {
        return name;
    }
}