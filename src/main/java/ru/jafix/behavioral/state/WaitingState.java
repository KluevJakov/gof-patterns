package ru.jafix.behavioral.state;

public class WaitingState implements ServiceState {
    @Override
    public void handleRequest(ServiceContext context) {
        System.out.println("Service waiting...");
        context.setCurrentState(new WorkingState());
    }
}
