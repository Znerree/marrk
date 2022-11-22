package com.appdev.marrk.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.marrk.Entity.AlertEntity;
import com.appdev.marrk.Repository.AlertRepository;

@Service
public class AlertService {
	
	@Autowired
	AlertRepository arepo; 
	
	//C - Create or insert a course record
	public AlertEntity insertAlert(AlertEntity alert) 
	{
		return arepo.save(alert);
	}
	
	//R - Read all Records from tbl_course
	public List<AlertEntity> getAllAlert(){															
		return arepo.findAll();
	}
	
	//Update Alert
	@SuppressWarnings("finally")
	public AlertEntity putAlert(int alertid, AlertEntity newAlerttDetails) throws Exception
	{
		AlertEntity alert = new AlertEntity();
		
		try
		{
			alert = arepo.findById(alertid).get();
			
			alert.setDisasterType(newAlerttDetails.getDisasterType());
			alert.setMessage(newAlerttDetails.getMessage());
			alert.setLocation(newAlerttDetails.getLocation());
			alert.setTime(newAlerttDetails.getTime());
			alert.setDate(newAlerttDetails.getDate());
		} catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + alertid + "does not exist!"); 
		} finally { 
			return arepo.save(alert); 
		}
	}

	public String deleteAlert(int alertid) {
		String msg;
		if(arepo.findById(alertid)!=null) {
			arepo.deleteById(alertid);
			
			msg = "Contact Number with ID of " + alertid + " Deleted!";
		}
		else
			msg = "Contact Number with ID of " + alertid + " is NOT found!";
		
		return msg;
	}
}
