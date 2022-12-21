package com.appdev.marrk.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.marrk.Entity.CitizenEntity;
import com.appdev.marrk.Repository.CitizenRepository;

@Service
public class CitizenService {
 
	@Autowired 
	CitizenRepository citizenrepo; 
	
    //CREATE CITIZEN
	public CitizenEntity insertCitizen(CitizenEntity citizen)
	{
			return citizenrepo.save(citizen); 
	}

	
	public List<CitizenEntity>getAllCitizen()
	{
		return citizenrepo.findAll();  
	}
	
	
	//UPDATE CITIZEN
	@SuppressWarnings("finally")
	public CitizenEntity putCitizen(int citizenid, CitizenEntity newCitizenDetails) throws Exception
	{
		CitizenEntity citizen = new CitizenEntity();
		
		try
		{

			citizen = citizenrepo.findById(citizenid).get(); 
			
			citizen.setFirstname(newCitizenDetails.getFirstname());
            citizen.setMiddlename(newCitizenDetails.getMiddlename());
			citizen.setLastname(newCitizenDetails.getLastname());
            citizen.setContactnumber(newCitizenDetails.getContactnumber());
            citizen.setAddress(newCitizenDetails.getAddress());


		} catch(NoSuchElementException nex) {
			throw new Exception("Citizen Number " + citizenid + "does not exist!"); 
		} finally { 
			return citizenrepo.save(citizen); 
		}
	}
	
	//DELETE CITIZEN
	public String deleteCitizen(int citizenid)
	{
		String msg;
		
		if(citizenrepo.findById(citizenid) !=null){
            citizenrepo.deleteById(citizenid); 		
		
			msg = "Citizen ID Number " + citizenid + " is succsessfully deleted!"; 
	} 
	else
		msg = "Citizen ID Number" + citizenid + " is NOT found!" ; 
		return msg;
		
	}

	//login
	public CitizenEntity userLogin(String username, String password){
		if(citizenrepo.findByUsername(username).getCitizenId() == citizenrepo.findByPassword(password).getCitizenId()){
			return citizenrepo.findByUsername(username);
		}
		else{
			return null;
		}
	}
}