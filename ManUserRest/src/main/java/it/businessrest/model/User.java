package it.businessrest.model;

import javax.validation.constraints.Email;

public class User {
	private int userId;
	private String firstName;
	private String lastName;
	
	@Email
	private String mail;

	public User(int userId, String firstName, String lastName, String mail) {

		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
