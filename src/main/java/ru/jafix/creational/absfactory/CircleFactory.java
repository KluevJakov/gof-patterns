package ru.jafix.creational.absfactory;

public class CircleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
