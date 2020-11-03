package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.Services.saveDescriptionService;
import com.registration.model.Description;

@RestController
public class UserDescriptionController {
	
		@Autowired
		saveDescriptionService saveService;
	
		@PostMapping("/Description")
		public void saveDescription(@RequestBody Description desc) {
			
			saveService.saveDescService(desc);
			
		}

}
