package com.registration.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.Dao.userRegistrationDao;
import com.registration.model.User;

@Service
public class userRegistrationServices {

	@Autowired
	userRegistrationDao userDao;

	public void userService(User user) {

		System.out.println(" User Entered into Service Class..!!");

		userDao.save(user);

	}

}
