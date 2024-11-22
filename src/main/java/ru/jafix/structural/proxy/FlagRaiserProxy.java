package ru.jafix.structural.proxy;

public class FlagRaiserProxy implements Raisable {

    private Raisable core;

    public FlagRaiserProxy(Raisable core) {
        this.core = core;
    }

    @Override
    public void raise(String color) {
        System.out.println("Играть гимн");
        core.raise(color+"-Синий");
        System.out.println("Играть барабан");
    }

}
