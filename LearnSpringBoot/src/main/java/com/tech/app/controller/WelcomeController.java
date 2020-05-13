package com.tech.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.app.service.NotificationService;

@RestController
public class WelcomeController {
	
	@Autowired
	private NotificationService notificationService;
	
	
	@RequestMapping("/")
	public String welcome() {
		
		return notificationService.getNotification();
		
	}

}
