package com.LearningBoot.Spring_Framework.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upi")
@Scope("prototype") // jab tak call nahe hoga tab tak new object create nahe hoga
public class UpiPayment implements PaymentService{
    public void pay(){
        System.out.println("Payment using Upi");
    }
}
