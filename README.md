# Food Delivery System - Design Patterns Project

## Overview

This project is a simple Food Delivery System developed in Java to demonstrate the use of multiple Design Patterns in one coherent application.

The system simulates a modern food delivery platform where customers can:

- Create meal orders
- Choose delivery methods
- Make payments
- Receive order updates
- Manage order states

The objective of this project is to apply object-oriented design principles and integrate several design patterns in a realistic software architecture.

---

# Design Patterns Implemented

## 1. Composite Pattern
Used to represent meals composed of multiple food items.

### Example
- Burger
- Fries
- Drink
- MealCombo

---

## 2. Strategy Pattern
Used for different delivery fee calculation methods.

### Implemented Strategies
- Standard Delivery
- Express Delivery

---

## 3. Observer Pattern
Used to notify customers when the order status changes.

### Example Notifications
- Preparing
- Out for Delivery
- Delivered

---

## 4. Factory Pattern
Used to create payment methods dynamically.

### Implemented Payments
- Card Payment
- Cash Payment

---

## 5. State Pattern
Used to manage the order lifecycle.

### Implemented States
- Pending
- Preparing
- Delivered

---

## 6. Adapter Pattern
Used to integrate an external PayPal API with the application.

---

## 7. Decorator Pattern
Used to add extra food options dynamically.

### Example
- Extra Cheese
- Extra Sauce

---

# Project Structure

```text
src/
 ├── observer/
 ├── strategy/
 ├── composite/
 ├── decorator/
 ├── factory/
 ├── state/
 ├── adapter/
 └── main/
