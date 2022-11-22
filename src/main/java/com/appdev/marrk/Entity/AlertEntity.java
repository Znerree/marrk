package com.appdev.marrk.Entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class AlertEntity {
	
	@Id
	private int alertid;
	private String disasterType;
	private String message;
	private String location;
    private String time ;
	private Date date;
	
	public AlertEntity(int alertid, String disasterType, String message, String location, String time ,Date date)
	{
		this.alertid = alertid;
		this.disasterType = disasterType;
		this.message = message;
		this.location = location;
        this.time = time;
		this.date = date; 
	}

    public AlertEntity(){};

    @Override
	public String toString() {
		return "AlertEntity [id=" + alertid + ", disasterType=" + disasterType + ", message=" + message + ", location=" + location
				+ ", time=" + time + ", date= "+ date + "]"; 
	}

    /*public int getId(){
        return alertid;
    }  */

    public void setId(int alertid){
        this.alertid = alertid;
    }

	public String getDisastertype() 
    {
		return disasterType;
	}

	public void setdisasterType(String disasterType) {
		this.disasterType = disasterType;
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
    
    public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}

