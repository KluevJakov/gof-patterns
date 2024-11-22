package ru.jafix.behavioral.memento;

public class Caretaker {
    private Memento memento;

    public void saveState(TextEditor textEditor) {
        memento = textEditor.save();
    }

    public void restoreState(TextEditor textEditor) {
        textEditor.restore(memento);
    }
}
