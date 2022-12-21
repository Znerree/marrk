package com.appdev.marrk.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_citizen")
public class CitizenEntity{
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int citizenid;
    private String username;
    private String password;
    private String firstname;
    private String middlename;
    private String lastname;
    private int contactNumber;
    private String address;

    public CitizenEntity(int citizenid, String username, String password, String firstname,  String middlename, String lastname, int contactNumber, String address){
        this.citizenid = citizenid; 
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public CitizenEntity(){}

    public void setCitizenId(int citizenid){
        this.citizenid = citizenid; 
    }

    public int getCitizenId(){
        return citizenid;
    }

    //USER
    public void setUsername(String username){
        this.username = username; 
    }

    public String getUsername(){
        return username;
    }

  //PASSWORD
    public void setPassword(String password){
        this.password = password; 
    }

    public String getPassword(){
        return password;
    }

  //FIRSTNAME
   public void setFirstname(String firstname){
        this.firstname = firstname; 
    }

    public String getFirstname(){
        return firstname;
    }
  
   //MIDDLENAME
    public void setMiddlename(String middlename){
        this.middlename = middlename; 
    }

    public String getMiddlename(){
        return middlename;
    }  

   //LASTNAME
    public void setLastname(String lastname){
        this.lastname = lastname; 
    }

    public String getLastname(){
        return lastname;
    }   

    //CONTACT
    public void setContactnumber(int contactNumber){
        this.contactNumber = contactNumber; 
    }

    public int getContactnumber(){
        return contactNumber;
    }   

    //ADDRESS
    public void setAddress(String address){
        this.address = address; 
    }

    public String getAddress(){
        return address;
    }

}
    



