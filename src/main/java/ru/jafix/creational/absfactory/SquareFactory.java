package ru.jafix.creational.absfactory;


public class SquareFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }

}
