package BehavioralDP.chainOfResponsibility;

public class A3_JuniorSupportHandler extends A1_SupportHandler{

    @Override
    public void setNextHandler(A1_SupportHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    @Override
    void handleRequest(String request) {
        if (request.equalsIgnoreCase("Intermediate"))
            System.out.println(request+" request handled from junior level.");
        else
            nextHandler.handleRequest(request);
    }
}
