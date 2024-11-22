package ru.jafix.behavioral.strategy;

public class WeightBasedStrategy implements DeliveryCostStrategy {

    @Override
    public double calculate(Order order) {
        return order.getWeight() * 5;
    }
}
