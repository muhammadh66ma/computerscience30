package fio;

import java.io.Serializable;

public class stuName implements Serializable {

	/**
	 * This id is used in the serialization process across different platforms.
	 */
	
	
	//Attributes/ Fields
	private String firstName;
	
	private String lastName;

	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public stuName() {
		super();
	}
	
	public stuName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	 // return the firstName
	 
	public String getFirstName() {
		return firstName;
	}
	 // set firstname
	 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	 //return the lastName
	 
	public String getLastName() {
		return lastName;
	}
	// lastName to set
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return (firstName+ " " + lastName);
	}
	
	
	
	}
	
	






