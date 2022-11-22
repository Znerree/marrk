package com.appdev.marrk.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.appdev.marrk.Entity.EmergencyServiceEntity;
import com.appdev.marrk.Repository.EmergencyServiceRepository;

@Service
public class EmergencyServiceService {
 
	@Autowired 
	EmergencyServiceRepository emergencyrepo; 
	
    //CREATE EMERGENCY SERVICE PROVIDER
	public EmergencyServiceEntity insertEmergencyServiceProviders(EmergencyServiceEntity emergency)
	{
			return emergencyrepo.save(emergency); 
	}

	
	public List<EmergencyServiceEntity>getAllEmergencyServiceProviders()
	{
		return emergencyrepo.findAll();  
	}
	
	
	//UPDATE EMERGENCY SERVICE PROVIDER
	@SuppressWarnings("finally")
	public EmergencyServiceEntity putEmergencyServiceProviders(int emergencyid, EmergencyServiceEntity newEmergencyDetails) throws Exception
	{
		EmergencyServiceEntity emergency = new EmergencyServiceEntity();
		
		try
		{

			emergency = emergencyrepo.findById(emergencyid).get(); 
			
			emergency.setFirstname(newEmergencyDetails.getFirstname());
            emergency.setMiddlename(newEmergencyDetails.getMiddlename());
			emergency.setLastname(newEmergencyDetails.getLastname());
            emergency.setContactnumber(newEmergencyDetails.getContactnumber());
            emergency.setAddress(newEmergencyDetails.getAddress());


		} catch(NoSuchElementException nex) {
			throw new Exception("Emergency Number " + emergencyid + "does not exist!"); 
		} finally { 
			return emergencyrepo.save(emergency); 
		}
	}
	
	//DELETE EMERGENCY SERVICE PROVIDER
	public String deleteEmergencyServiceProviders(int emergencyid)
	{
		String msg;
		
		if(emergencyrepo.findById(emergencyid) !=null){
            emergencyrepo.deleteById(emergencyid); 		
		
			msg = "Emergency Service Provider" + emergencyrepo + " is succsessfully deleted!"; 
	} 
	else
		msg = "Emergency Service Provider ID Number" + emergencyrepo + " is NOT found!" ; 
		return msg;
		
	}
}