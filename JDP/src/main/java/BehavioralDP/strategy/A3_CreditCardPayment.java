package BehavioralDP.strategy;

import java.math.BigDecimal;

public class A3_CreditCardPayment implements A1_PaymentStrategy{
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Payment done via Credit Card strategy for amount: "+amount);
    }
}
