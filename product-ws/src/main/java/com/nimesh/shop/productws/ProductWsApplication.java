package com.nimesh.shop.productws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@Component
//@ComponentScan(basePackages = {"com.nimesh.shop.productws.repository"})
public class ProductWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductWsApplication.class, args);
	}

}
