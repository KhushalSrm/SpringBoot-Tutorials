package com.Khushal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(DemoApplication.class, args); 	// ApplicationContext,this helps us to get the bean
		Dev obj = context.getBean(Dev.class);

		obj.code();
	}

}
