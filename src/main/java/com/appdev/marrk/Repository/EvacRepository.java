package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.marrk.Entity.EvacEntity;


@Repository
public interface EvacRepository extends JpaRepository<EvacEntity, Integer>{
	
}
