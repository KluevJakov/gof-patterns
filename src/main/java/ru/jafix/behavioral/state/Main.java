package ru.jafix.behavioral.state;

public class Main {
    public static void main(String[] args) {
        ServiceContext context = new ServiceContext();

        context.request();
        context.request();
        context.request();
        context.request();
    }
}