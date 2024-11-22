package ru.jafix.behavioral.state;

public class CompletedState implements ServiceState {
    @Override
    public void handleRequest(ServiceContext context) {
        System.out.println("Service has complete job...");
        context.setCurrentState(new WaitingState());
    }
}
