package BehavioralDP.chainOfResponsibility;

public abstract class A1_SupportHandler {
    A1_SupportHandler nextHandler;

    abstract void handleRequest(String request);
    abstract void setNextHandler(A1_SupportHandler nextHandler);
}