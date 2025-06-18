package BehavioralDP.strategy;

import java.math.BigDecimal;

public class A5_ShoppingCart {

    private A1_PaymentStrategy paymentStrategy;

    public A5_ShoppingCart(A1_PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void setPaymentStrategy(A1_PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void checkOut(BigDecimal amount){
        paymentStrategy.processPayment(amount);
    }
}
