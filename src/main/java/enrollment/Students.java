package enrollment;



import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Students implements  Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	String name;
	String surname;
	String studenNumber;
	@Embedded
	Address address;
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}

	public void setStudentNumber(String studentNumber){
		this.studenNumber = studentNumber;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	
	
	public String getName(){
		return this.name;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public String getStudentNumber(){
		return this.studenNumber;
	}
}
