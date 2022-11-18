package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.marrk.Entity.ContactEntity;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
	
}
