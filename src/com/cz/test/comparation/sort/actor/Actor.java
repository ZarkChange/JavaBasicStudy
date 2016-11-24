package com.cz.test.comparation.sort.actor;

public class Actor implements Comparable<Actor>{
	
	private String firstName;	
	private String lastName;
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Actor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int compareTo(Actor other){
		int value=this.lastName.compareTo(other.lastName);
		
		if(value!=0){
			return value;
		}
		value=this.firstName.compareTo(other.firstName);
		return value;
	}
	

}
