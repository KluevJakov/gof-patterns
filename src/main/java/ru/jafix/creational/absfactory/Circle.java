package ru.jafix.creational.absfactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
}
