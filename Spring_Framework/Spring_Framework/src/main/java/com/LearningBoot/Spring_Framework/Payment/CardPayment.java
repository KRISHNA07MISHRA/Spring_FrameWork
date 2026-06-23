package com.LearningBoot.Spring_Framework.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
//@Qualifier("card")
public class CardPayment implements PaymentService{

    public void pay(){
        System.out.println("Payment using Card");
    }
}
