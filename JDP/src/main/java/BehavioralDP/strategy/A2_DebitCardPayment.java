package BehavioralDP.strategy;

import java.math.BigDecimal;

public class A2_DebitCardPayment implements A1_PaymentStrategy{

    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Payment done via Debit Card strategy for amount: "+amount);
    }
}
