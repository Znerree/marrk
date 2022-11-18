package com.appdev.marrk.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_evac")

public class EvacEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String evac_name;
	private String travel_time;
	
	public EvacEntity() {} //default constructor
	
	public EvacEntity(int id, String evac_name, String travel_time) {
		super();
		this.id = id;
		this.evac_name = evac_name;
		this.travel_time = travel_time;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getEvac_name() {
		return evac_name;
	}

	public void setEvac_name(String evac_name) {
		this.evac_name = evac_name;
	}

	public String getTravel_time() {
		return travel_time;
	}

	public void setTravel_time(String travel_time) {
		this.travel_time = travel_time;
	}
	
	
	
	
	
}
