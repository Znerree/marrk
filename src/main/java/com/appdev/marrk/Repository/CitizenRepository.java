package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.marrk.Entity.CitizenEntity;


@Repository
public interface CitizenRepository extends JpaRepository<CitizenEntity, Integer>{
}
