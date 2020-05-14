package com.tech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tech.app.beans.User;
import com.tech.app.config.MyOracleDbConfig;

@SpringBootApplication
//@ComponentScan({"com.tech.app.service","com.tech.app.controller","com.tech.app.beans","com.tech.app.config"})
@EnableConfigurationProperties
public class LearnSpringBootApplication {
	
	@Bean
	public User user() {
		
		return new User(101,"Ravi","Gupta","ShivaJi");
	}

	
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(LearnSpringBootApplication.class, args);
		
		MyOracleDbConfig dbConfig = (MyOracleDbConfig)ctx.getBean("myOracleDbConfig");
		System.out.println(dbConfig.getDriverClass());
		String beans[] = ctx.getBeanDefinitionNames();
		
				
		/*
		 * Arrays.sort(beans); for(String s: beans) {
		 * 
		 * System.out.println(s); }
		 */
	}
	

}
