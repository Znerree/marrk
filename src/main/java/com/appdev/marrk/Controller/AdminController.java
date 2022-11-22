package com.appdev.marrk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.marrk.Entity.AdminEntity;
import com.appdev.marrk.Service.AdminService;



@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminserv;
	
	@GetMapping("/getAllAdmin")
	public List<AdminEntity> getAllAdmin(){
		return adminserv.getAllAdmin();
	}
	
	@PostMapping("/postAdmin")
	public AdminEntity insertAdmin(@RequestBody AdminEntity admin) {
		return adminserv.insertAdmin(admin);
	}
	
	@PutMapping("/putAdmin")
	public AdminEntity putAdmin(@RequestParam int adminid, @RequestBody AdminEntity newAdminDetails) throws Exception {
		return adminserv.putAdmin(adminid, newAdminDetails);
	}
	
	@DeleteMapping("/deleteAdmin/{adminid}")
	public String deleteAdmin(@PathVariable int adminid) {															
		return adminserv.deleteAdmin(adminid);
	}

}