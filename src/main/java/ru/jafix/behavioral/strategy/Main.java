package ru.jafix.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(3, 1000, 20);

        calc(new CostBasedStrategy(), order);
        calc(new DistanceBasedStrategy(), order);
        calc(new WeightBasedStrategy(), order);
    }

    public static void calc(DeliveryCostStrategy deliveryCostStrategy, Order order) {
        System.out.println(deliveryCostStrategy.calculate(order));
    }
}