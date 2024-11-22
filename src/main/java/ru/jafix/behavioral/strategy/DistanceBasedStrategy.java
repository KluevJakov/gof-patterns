package ru.jafix.behavioral.strategy;

public class DistanceBasedStrategy implements DeliveryCostStrategy {

    @Override
    public double calculate(Order order) {
        return order.getDistance() * 3;
    }
}
