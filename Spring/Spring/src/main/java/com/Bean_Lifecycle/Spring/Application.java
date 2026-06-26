package com.Bean_Lifecycle.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ResFile.class);

		cartService service = context.getBean(cartService.class);

		System.out.println(service.getvalue(1));

		context.close();
	}

}
