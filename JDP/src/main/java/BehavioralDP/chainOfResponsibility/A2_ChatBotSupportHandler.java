package BehavioralDP.chainOfResponsibility;

public class A2_ChatBotSupportHandler extends A1_SupportHandler {

    @Override
    public void setNextHandler(A1_SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Basic"))
            System.out.println(request+" request handled from ChatBot.");
        else
            nextHandler.handleRequest(request);
    }
}
