package com.registration.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.model.Description;

@Repository
public interface saveDescriptionRepository extends JpaRepository<Description, Integer> {

}
