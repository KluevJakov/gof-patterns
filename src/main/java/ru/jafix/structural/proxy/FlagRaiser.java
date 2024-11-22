package ru.jafix.structural.proxy;

public class FlagRaiser implements Raisable {

    @Override
    public void raise(String color) {
        System.out.printf("Поднимать флаг (цвет: %s)%n" , color);
    }

}
