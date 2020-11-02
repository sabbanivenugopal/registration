package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.Services.userRegistrationServices;
import com.registration.model.User;

@RestController
public class UserRegistrationController {
	@Autowired
	userRegistrationServices userRegServices;

	@PostMapping("/userDetails")
	public void userRegistrationDetails(@RequestBody User user) {

		System.out.println("User Entered into Controller Class..!!");

		userRegServices.userService(user);

	}

}
