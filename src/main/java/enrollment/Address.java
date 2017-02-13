package enrollment;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable  {

	String houseNumber;
	String streetName;
	String suburb;
	String postalCode;
	
	public Address(){}
	
	public void setHouseNumber(String houseNumber){
		this.houseNumber = houseNumber;
	}
	
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}
	
	public void setSuburb(String suburb){
		this.suburb = suburb;
	}
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getHouseNumber(){
		return this.houseNumber;
	}
	
	public String getStreetName(){
		return this.streetName;
	}
	
	public String getSuburb(){
		return this.suburb;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
	
	
}
