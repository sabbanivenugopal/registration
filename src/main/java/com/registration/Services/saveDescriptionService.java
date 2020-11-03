package com.registration.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.Dao.saveDescriptionRepository;
import com.registration.model.Description;

@Service
public class saveDescriptionService {
	
	@Autowired
	saveDescriptionRepository saveDesc;

	public void saveDescService(Description desc) {
		System.out.println(desc.getDescription());
		saveDesc.save(desc);
	}
	

}
