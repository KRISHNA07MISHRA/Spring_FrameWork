package com.LearningBoot.Spring_Framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.LearningBoot.Spring_Framework.Payment.PaymentService;

@Component
public class OrderService {

    //@Autowired -> here it work as field injection
    private PaymentService paymentService;

    @Autowired //-> here it work as construction injection
    public OrderService(@Qualifier("card")PaymentService paymentService){
        this.paymentService = paymentService;
    }

    // @Autowired // -> Setter Injection
    // public void setOrderService(PaymentService paymentService){
    //     this.paymentService = paymentService;
    // }
    

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
