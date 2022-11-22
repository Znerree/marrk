package com.appdev.marrk.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_alert")
public class AlertEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int alertid;
	private String disastertype;
	private String message;
	private String location;
    private String time ;
	private String date;
	
	public AlertEntity(int alertid, String disastertype, String message, String location, String time ,String date)
	{
		super(); 
		this.alertid = alertid;
		this.disastertype = disastertype;
		this.message = message;
		this.location = location;
        this.time = time;
		this.date = date; 
	}

    public AlertEntity(){};

      public int getAlertId(){
        return alertid;
    }  

     public void setAlertId(int alertid){
        this.alertid = alertid;
    } 

	public String getDisasterType() 
    {
		return disastertype;
	}

	public void setDisasterType(String disastertype) {
		this.disastertype = disastertype;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
    
    public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}

