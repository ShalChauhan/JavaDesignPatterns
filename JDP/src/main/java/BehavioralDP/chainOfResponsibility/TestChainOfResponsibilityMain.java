package BehavioralDP.chainOfResponsibility;

public class TestChainOfResponsibilityMain {
    public static void main(String ar[]){
        A1_SupportHandler supportHandler1=new A2_ChatBotSupportHandler();
        A1_SupportHandler supportHandler2=new A3_JuniorSupportHandler();
        A1_SupportHandler supportHandler3=new A4_ManagerSupportHandler();

        supportHandler1.setNextHandler(supportHandler2);
        supportHandler2.setNextHandler(supportHandler3);

        supportHandler1.handleRequest("Major");
        supportHandler1.handleRequest("Intermediate");
        supportHandler1.handleRequest("Basic");
    }
}
