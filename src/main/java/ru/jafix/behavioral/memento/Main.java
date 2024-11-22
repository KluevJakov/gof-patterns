package ru.jafix.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        Caretaker caretaker = new Caretaker();

        te.addText("Hello,");
        caretaker.saveState(te);
        te.addText("world!");

        System.out.println(te.getText());

        caretaker.restoreState(te);

        System.out.println(te.getText());
    }
}