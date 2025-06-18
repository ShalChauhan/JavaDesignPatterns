package BehavioralDP.chainOfResponsibility;

public class A4_ManagerSupportHandler extends A1_SupportHandler{

    @Override
    public void setNextHandler(A1_SupportHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    @Override
    void handleRequest(String request) {
        System.out.println(request+" request handled on final level.");
    }
}
