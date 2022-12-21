package com.appdev.marrk.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_contacts")
public class ContactEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contact_id;
	
	private String contact_num;
	private String contact_first_name;
	private String contact_last_name;
	private String contact_type;
	
	public ContactEntity() {}
	public ContactEntity(int contact_id, String contact_num, String contact_first_name, String contact_last_name,
			String contact_type) {
		super();
		this.contact_id = contact_id;
		this.contact_num = contact_num;
		this.contact_first_name = contact_first_name;
		this.contact_last_name = contact_last_name;
		this.contact_type = contact_type;
	}

	public String getContact_num() {
		return contact_num;
	}

	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}

	public String getContact_firstName() {
		return contact_first_name;
	}

	public void setContact_firstName(String contact_first_name) {
		this.contact_first_name = contact_first_name;
	}

	public String getContact_lastName() {
		return contact_last_name;
	}

	public void setContact_lastName(String contact_last_name) {
		this.contact_last_name = contact_last_name;
	}

	public String getContact_type() {
		return contact_type;
	}

	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}

	public int getContact_id() {
		return contact_id;
	}
	
}