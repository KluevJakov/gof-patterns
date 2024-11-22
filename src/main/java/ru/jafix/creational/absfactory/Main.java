package ru.jafix.creational.absfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractFactory af = null;

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                af = new CircleFactory();
            break;
            case 2:
                af = new SquareFactory();
            break;
            case 3:
                af = new RectFactory();
            break;
        }

        Shape shape = af.createShape();
        shape.draw();
    }
}