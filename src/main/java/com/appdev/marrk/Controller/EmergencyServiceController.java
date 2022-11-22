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

import com.appdev.marrk.Entity.EmergencyServiceEntity;
import com.appdev.marrk.Service.EmergencyServiceService;

@RestController
@RequestMapping("/emergency")
public class EmergencyServiceController {
	
	@Autowired
	EmergencyServiceService emergencyserv;
	
	@GetMapping("/getAllEmergencyService")
	public List<EmergencyServiceEntity> getAllEmergencyServiceProviders(){
		return emergencyserv.getAllEmergencyServiceProviders();
	}
	
	@PostMapping("/postEmergencyService")
	public EmergencyServiceEntity insertEmergencyServiceProviders(@RequestBody EmergencyServiceEntity emergency) {
		return emergencyserv.insertEmergencyServiceProviders(emergency);
	}
	
	@PutMapping("/putEmergencyService")
	public EmergencyServiceEntity putEmergencyServiceProviders(@RequestParam int emergencyid, @RequestBody EmergencyServiceEntity newEmergencyDetails) throws Exception {
		return emergencyserv.putEmergencyServiceProviders(emergencyid, newEmergencyDetails);
	}
	
	@DeleteMapping("/deleteEmergencyService/{emergencyid}")
	public String deleteAlert(@PathVariable int emergencyid) {															
		return emergencyserv.deleteEmergencyServiceProviders(emergencyid);
	}

}