package com.LearningBoot.Spring_Framework;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

//@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



		OrderService order = context.getBean(OrderService.class);
		order.placeOrder();
		
	}

}
