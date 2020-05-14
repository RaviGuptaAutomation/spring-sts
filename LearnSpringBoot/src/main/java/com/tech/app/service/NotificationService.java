package com.tech.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.app.beans.User;

@Service
public class NotificationService {
	
	@Autowired
	private User userinfo;
	
	public String getNotification() {
		
		//String notification = "Hello Spring Boot from the Notification Serivce !";
		String userData = userinfo.getId()+" "+userinfo.getFirstName();
		
		return userData;
	}

}
