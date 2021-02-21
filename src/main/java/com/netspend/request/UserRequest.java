package com.netspend.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserRequest {

	@NotNull(message="First Name can not be null")
	@Size(min = 2, message = "First Name can not be less than 2 characters")
	private String firstName;
	@NotNull(message="Last Name can not be null")
	@Size(min = 2, message = "Last Name can not be less than 2 characters")
	private String lastName;
	@NotNull(message="Email can not be null")
	@Email
	private String email;
	@NotNull(message="Password can not be null")
	@Size(min = 8, max =16, message = "Password can not be less than 8 characters and more than 16 characters") 
	private String password;
	private String id;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
