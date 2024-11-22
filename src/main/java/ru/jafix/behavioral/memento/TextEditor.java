package ru.jafix.behavioral.memento;

public class TextEditor {
    private StringBuilder sb;

    public TextEditor() {
        this.sb = new StringBuilder();
    }

    public void addText(String newText) {
        sb.append(newText);
    }

    public String getText() {
        return sb.toString();
    }

    public Memento save() {
        return new Memento(getText());
    }

    public void restore(Memento memento) {
        sb = new StringBuilder(memento.getText());
    }
}
