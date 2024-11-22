package ru.jafix.creational.absfactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Рисую квадрат");
    }
}
