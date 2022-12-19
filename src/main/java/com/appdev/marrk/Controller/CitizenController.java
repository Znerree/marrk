package com.appdev.marrk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appdev.marrk.Entity.CitizenEntity;
import com.appdev.marrk.Service.CitizenService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	CitizenService citizenserv;
	
	@GetMapping("/getAllCitizen")
	public List<CitizenEntity> getAllCitizen(){
		return citizenserv.getAllCitizen();
	}
	
	@PostMapping("/postCitizen")
	public CitizenEntity inserCitizen(@RequestBody CitizenEntity citizen) {
		return citizenserv.insertCitizen(citizen);
	}
	
	@PutMapping("/putCitizen")
	public CitizenEntity putCitizen(@RequestParam int citizenid, @RequestBody CitizenEntity newAlertDetails) throws Exception {
		return citizenserv.putCitizen(citizenid, newAlertDetails);
	}
	
	@DeleteMapping("/deleteCitizen/{citizenid}")
	public String deleteAlert(@PathVariable int citizenid) {															
		return citizenserv.deleteCitizen(citizenid);
	}

	@GetMapping("/userLogin")
	public boolean userLogin(@RequestParam String username, @RequestParam String password){
		return citizenserv.userLogin(username, password);
	}

}