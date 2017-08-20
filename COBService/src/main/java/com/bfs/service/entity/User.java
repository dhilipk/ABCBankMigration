package com.bfs.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;
	private String name;
    private String username;
	private String accountType;
	private String email;
	private String phoneNumber;
	private String password;
	private String token;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User() {
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User(String id, String name, String username, String accountType, String email, String phoneNumber,
			String password, String token) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.accountType = accountType;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.token = token;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", accountType=" + accountType
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", password=" + password + ", token=" + token
				+ "]";
	}


}