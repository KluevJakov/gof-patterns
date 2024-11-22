package ru.jafix.behavioral.state;

public interface ServiceState {
    void handleRequest(ServiceContext context);
}
