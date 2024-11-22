package ru.jafix.behavioral.state;

public class WorkingState implements ServiceState {
    @Override
    public void handleRequest(ServiceContext context) {
        System.out.println("Service working...");
        context.setCurrentState(new CompletedState());
    }
}
