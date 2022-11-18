package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appdev.marrk.Entity.EvacEntity;

public interface EvacRepository extends JpaRepository<EvacEntity, Integer>{
	
}
