package BehavioralDP.strategy;

import java.math.BigDecimal;

public class A4_PayPalPayment implements A1_PaymentStrategy{
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Payment done via PayPal Strategy for amount: "+amount);
    }
}
