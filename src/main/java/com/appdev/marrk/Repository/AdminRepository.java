
package com.appdev.marrk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.marrk.Entity.AdminEntity;


@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
}
