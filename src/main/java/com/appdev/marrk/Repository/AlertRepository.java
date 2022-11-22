package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.marrk.Entity.AlertEntity;


@Repository
public interface AlertRepository extends JpaRepository<AlertEntity, Integer>{
	AlertEntity findByDisasterType(String disasterType); 
}
