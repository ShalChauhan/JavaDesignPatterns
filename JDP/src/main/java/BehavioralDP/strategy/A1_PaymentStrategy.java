package BehavioralDP.strategy;

import java.math.BigDecimal;

@FunctionalInterface
public interface A1_PaymentStrategy {
    void processPayment(BigDecimal amount);
}
