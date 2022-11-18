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

import com.appdev.marrk.Entity.ContactEntity;
import com.appdev.marrk.Service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	ContactService contactserv;
	
	@GetMapping("/getAllContacts")
	public List<ContactEntity> getAllContacts(){
		return contactserv.getAllContacts();
	}
	
	@PostMapping("/postContact")
	public ContactEntity insertContact(@RequestBody ContactEntity contact) {
		return contactserv.insertContact(contact);
	}
	
	@PutMapping("/putContact")
	public ContactEntity putContact(@RequestParam int id, @RequestBody ContactEntity newContactDetails) throws Exception {
		return contactserv.putContact(id, newContactDetails);
	}
	
	@DeleteMapping("/deleteContact/{id}")
	public String deleteContact(@PathVariable int id) {
		return contactserv.deleteContact(id);
	}
}
