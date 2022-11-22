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

import com.appdev.marrk.Entity.AlertEntity;
import com.appdev.marrk.Service.AlertService;

@RestController
@RequestMapping("/alert")
public class AlertController {
	
	@Autowired
	AlertService alertserv;
	
	@GetMapping("/getAllAlert")
	public List<AlertEntity> getAllAlert(){
		return alertserv.getAllAlert();
	}
	
	@PostMapping("/postAlert")
	public AlertEntity insertContact(@RequestBody AlertEntity alert) {
		return alertserv.insertAlert(alert);
	}
	
	@PutMapping("/putAlert")
	public AlertEntity putContact(@RequestParam int id, @RequestBody AlertEntity newAlertDetails) throws Exception {
		return alertserv.putAlert(id, newAlertDetails);
	}
	
	@DeleteMapping("/deleteAlert/{id}")
	public String deleteAlert(@PathVariable int alertid) {
		return alertserv.deleteAlert(alertid);
	}
}