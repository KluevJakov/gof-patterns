package ru.jafix.creational.absfactory;

public class RectFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
