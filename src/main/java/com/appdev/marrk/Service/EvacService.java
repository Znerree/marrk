package com.appdev.marrk.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdev.marrk.Entity.EvacEntity;
import com.appdev.marrk.Repository.EvacRepository;

@Service
public class EvacService {
		
	@Autowired
	EvacRepository erepo;
	
	public EvacEntity insertEvac(EvacEntity evac){													//C - CREATE 
		return erepo.save(evac);
	}
	
	public List<EvacEntity> getAllEvac(){															//R - READ
		return erepo.findAll();
	}
	
	public EvacEntity putEvac(int id, EvacEntity newEvacDetails) throws Exception{    				//U - UPDATE
		EvacEntity map = new EvacEntity();
		try {
			map = erepo.findById(id).get();
			
			map.setEvac_name(newEvacDetails.getEvac_name());
			map.setTravel_time(newEvacDetails.getTravel_time());
			
			return erepo.save(map);
		
		} catch(NoSuchElementException nex) {
			throw new Exception("This id number " + id + " does not exist. Please try again.");
		}
	}
	
	public String deleteEvac(int id) {																//D - DELETE
		String msg;
		if(erepo.findById(id) != null) { //finds by id
			erepo.deleteById(id);		//delete using the found id
			
			msg = "The id number " + id + " has been deleted.";
		}
		else
			msg = "The id number " +id + " does not exist in the database. Please try again.";
		return msg;
	}

} 
