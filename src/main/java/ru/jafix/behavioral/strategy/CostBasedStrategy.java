package ru.jafix.behavioral.strategy;

public class CostBasedStrategy implements DeliveryCostStrategy {

    @Override
    public double calculate(Order order) {
        if (order.getCost() < 300) {
            return 300;
        }
        return order.getCost() * 1.05;
    }
}
