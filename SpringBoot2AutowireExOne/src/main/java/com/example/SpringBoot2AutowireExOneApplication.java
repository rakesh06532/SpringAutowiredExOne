package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2AutowireExOneApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(SpringBoot2AutowireExOneApplication.class, args);
		Product p=ac.getBean("pobj",Product.class);
		p.getProduct();
	}

}
