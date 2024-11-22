package ru.jafix.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private double weight;
    private double cost;
    private double distance;
}
