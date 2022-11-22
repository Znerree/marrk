package com.appdev.marrk.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_emergency")
public class EmergencyServiceEntity{
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emergencyid;
    private String username;
    private String password;
    private String firstname;
    private String middlename;
    private String lastname;
    private int contactNumber;
    private String address; 
    private int hotline; 

    public EmergencyServiceEntity(int emergencyid, String username, String password, String firstname,  String middlename, String lastname, int contactNumber, String address, int hotline){
        this.emergencyid = emergencyid; 
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public EmergencyServiceEntity(){}

    public void getEmergencyid(int emergencyid){
        this.emergencyid = emergencyid; 
    }

    public int setEmergencyid(){
        return emergencyid;
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
    
    //HOTLINE
    public void setHotline(int hotline){
        this.hotline = hotline; 
    }

    public int getHotline(){
        return hotline;
    }   

}
    



