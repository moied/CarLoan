package com.diczag.carloan.business.entity;

import java.util.HashMap;
import java.util.Map;

public class User {
	private static final Map<String, User> USERS = new HashMap<String, User>();
	
	private String username;
	
	private String password;
	
	private ACTOR actor;

	public static void addUser(User user) {
		USERS.put(user.getUsername(), user);
	}
	
	public static boolean validate(String username, String password) {
		User validUser = USERS.get(username);
		if (validUser != null) {
			String validUserPassword = validUser.getPassword();
			return validUserPassword != null && validUserPassword.equals(password);
		} else {
			return false;
		}
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public ACTOR getActor() {
		return actor;
	}

	public void setActor(ACTOR actor) {
		this.actor = actor;
	}
}
