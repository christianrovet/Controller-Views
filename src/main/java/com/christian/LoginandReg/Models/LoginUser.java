package com.christian.LoginandReg.Models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {
	@NotEmpty(message = "You need to enter an Email!")
    @Email(message = "Needs to be a valid Email Address!")
    private String email;
    
    @NotEmpty(message = "You need to enter an Password!")
    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters!")
    private String password;
    
    public LoginUser() {}

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
    
}
