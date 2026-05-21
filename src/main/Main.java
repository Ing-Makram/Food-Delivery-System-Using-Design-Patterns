package main;

import Composite.*;
import Strategy.*;
import Observer.*;
import Factory.*;
import State.*;
import Adapter.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== COMPOSITE PATTERN =====");

        FoodItem burger = new FoodItem("Burger", 20);
        FoodItem fries = new FoodItem("Fries", 10);

        MealCombo combo = new MealCombo("Burger Combo");

        combo.addItem(burger);
        combo.addItem(fries);

        System.out.println("Meal: " + combo.getName());
        System.out.println("Total Price: " + combo.getPrice());



        System.out.println("\n===== STRATEGY PATTERN =====");

        DeliveryStrategy strategy = new ExpressDelivery();

        System.out.println("Delivery Fee: "
                + strategy.calculateDeliveryFee());



        System.out.println("\n===== OBSERVER PATTERN =====");

        Order order = new Order();

        Customer customer1 = new Customer("Ali");
        Customer customer2 = new Customer("Sara");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Preparing");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");



        System.out.println("\n===== FACTORY PATTERN =====");

        Payment payment =
                PaymentFactory.createPayment("CARD");

        payment.pay(combo.getPrice());



        System.out.println("\n===== STATE PATTERN =====");

        OrderState pending = new PendingState();
        OrderState preparing = new PreparingState();
        OrderState delivered = new DeliveredState();

        pending.handle();
        preparing.handle();
        delivered.handle();



        System.out.println("\n===== ADAPTER PATTERN =====");

        PaymentProcessor processor =
                new PayPalAdapter();

        processor.processPayment(combo.getPrice());
    }
}