package com.registration.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.model.User;

@Repository
public interface userRegistrationDao extends JpaRepository<User, String>{

}
