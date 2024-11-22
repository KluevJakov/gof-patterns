package ru.jafix.behavioral.state;

import lombok.Setter;

@Setter
public class ServiceContext {
    private ServiceState currentState;

    public ServiceContext() {
        currentState = new WaitingState();
    }

    public void request() {
        currentState.handleRequest(this);
    }
}
