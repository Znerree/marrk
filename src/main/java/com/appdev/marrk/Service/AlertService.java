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
	public List<AlertEntity>getAllAlert()
	{
		return arepo.findAll();
	}
	
	public AlertEntity findByDisasterType(String disasterType)
	{
		if(arepo.findByDisasterType(disasterType) != null)
			return arepo.findByDisasterType(disasterType);
		else 
			return null; 
	}
	
	//R-Read or search record by Course Description 
	@SuppressWarnings("finally")
	public AlertEntity putAlert(int alertid, AlertEntity newAlerttDetails) throws Exception
	{
		AlertEntity alert = new AlertEntity();
		
		try
		{
			//steps in updating
			//Step 1 - search the id number of the student
			alert = arepo.findById(alertid).get(); //findbyId() is pre-defined method
			
			//Step 2 - Update the record
			alert.setMessage(newAlerttDetails.getMessage());
			alert.setTime(newAlerttDetails.getTime());
			
		//Step 3 - save the information and return the value  - refer to finally block 
		} catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + alertid + "does not exist!"); 
		} finally { 
			return arepo.save(alert); 
		}
	}
	
	//Delete - Delete course record
	/**
	 * @param alertid
	 * @return
	 */
	public String deleteAlert(int alertid)
	{
		String msg;
		if(arepo.findById(alertid) != null)
		{
			arepo.deleteById(alertid);
			msg = "Alert ID " + alertid + " is succssessfully deleted!";  
		} else
			msg = "Alert ID " + alertid + "is NOT found!";
		  return msg;
    }
}