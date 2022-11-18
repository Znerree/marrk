package com.appdev.marrk.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.marrk.Entity.ContactEntity;
import com.appdev.marrk.Repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepo;
	
	//createContact
	public ContactEntity insertContact(ContactEntity contact) {
		return contactRepo.save(contact);
	}
	//readAllContacts
	public List<ContactEntity> getAllContacts(){
		return contactRepo.findAll();
	}
	//updateContact
	public ContactEntity putContact(int id, ContactEntity newContactDetails) throws Exception{
		
		ContactEntity contact = new ContactEntity();
		
		try {
			contact = contactRepo.findById(id).get();
			contact.setContact_firstName(newContactDetails.getContact_firstName());
			contact.setContact_lastName(newContactDetails.getContact_lastName());
			contact.setContact_num(newContactDetails.getContact_num());
			contact.setContact_type(newContactDetails.getContact_type());
			
			return contactRepo.save(contact);
			
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " +id + " does not exist!");
		}
	}
	//delete Contact
	public String deleteContact(int id) {
		String msg;
		if(contactRepo.findById(id)!=null) {
			contactRepo.deleteById(id);
			
			msg = "Contact Number with ID of " + id + " Deleted!";
		}
		else
			msg = "Contact Number with ID of " + id + " is NOT found!";
		
		return msg;
	}
}
