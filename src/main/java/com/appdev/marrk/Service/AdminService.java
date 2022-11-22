package com.appdev.marrk.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.marrk.Entity.AdminEntity;
import com.appdev.marrk.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminrepo; 
	
	//C - Create or insert a course record
	public AdminEntity insertAdmin(AdminEntity admin) 
	{
		return adminrepo.save(admin);
	}
	
	//R - Read all Records from tbl_admin
	public List<AdminEntity> getAllAdmin(){															
		return adminrepo.findAll();
	}
	
    //U - Update Details of Admin
	@SuppressWarnings("finally")
	public AdminEntity putAdmin(int adminid, AdminEntity newAdminDetails) throws Exception
	{
		AdminEntity admin = new AdminEntity();
		
		try
		{
			admin = adminrepo.findById(adminid).get();
			
            admin.setPassword(newAdminDetails.getPassword());
			admin.setFirstname(newAdminDetails.getFirstname());
			admin.setMiddlename(newAdminDetails.getMiddlename());
			admin.setLastname(newAdminDetails.getLastname());
		} catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + adminid + "does not exist!"); 
		} finally { 
			return adminrepo.save(admin); 
		}
	}

	public String deleteAdmin(int adminid) {
		String msg;
		if(adminrepo.findById(adminid)!=null) {
			adminrepo.deleteById(adminid);
			
			msg = "Admin Number with ID of " + adminid + " Deleted!";
		}
		else
			msg = "Admin Number with ID of " + adminid + " is NOT found!";

		return msg;
	}
}
