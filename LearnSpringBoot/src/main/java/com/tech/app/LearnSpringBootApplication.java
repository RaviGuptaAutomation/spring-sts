package com.tech.app;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.tech.app.service","com.tech.app.controller","com.tech.app.beans"})
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(LearnSpringBootApplication.class, args);
		
		String beans[] = ctx.getBeanDefinitionNames();
		
		Arrays.sort(beans);
		for(String s: beans) {
			
			System.out.println(s);
		}
	}
	

}
