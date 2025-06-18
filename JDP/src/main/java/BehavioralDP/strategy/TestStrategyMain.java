package BehavioralDP.strategy;

import java.math.BigDecimal;

public class TestStrategyMain {
    public static void main(String ar[]){
        A5_ShoppingCart shoppingCart=new A5_ShoppingCart(new A4_PayPalPayment());
        shoppingCart.checkOut(BigDecimal.valueOf(1000));

        shoppingCart.setPaymentStrategy(new A3_CreditCardPayment());
        shoppingCart.checkOut(BigDecimal.valueOf(5000));

    }
}
