package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.marrk.Entity.EmergencyServiceEntity;


@Repository
public interface EmergencyServiceRepository extends JpaRepository<EmergencyServiceEntity, Integer>{
}
