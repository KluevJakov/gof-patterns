package ru.jafix.structural.proxy;

public class Main {
    public static void main(String[] args) {
        FlagRaiser fr = new FlagRaiser();
        FlagRaiserProxy frp = new FlagRaiserProxy(fr);

        frp.raise("Красный");

        frp.raise("Черный");
    }
}