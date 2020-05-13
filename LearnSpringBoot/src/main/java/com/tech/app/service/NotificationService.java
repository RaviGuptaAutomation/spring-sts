package com.tech.app.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	
	
	public String getNotification() {
		
		String notification = "Hello Spring Boot from the Notification Serivce !";
		
		return notification;
	}

}
