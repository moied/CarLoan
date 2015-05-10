package com.diczag.carloan.business.utility;

public class LogIn {
	
	private String userName;
	
	private String password;
	
	public LogIn (String userName, String password) {
		this.userName = userName;
		this.password = Encryption.encrypt(password);
	}
	
	/* Comparano i dati di login passati con quelli salvati.
	 * Se corrispondono ritornano TRUE, altrimenti FALSE.
	 * */
	public Boolean compareUsername (String user) {
		if (user.compareTo(userName) != 0)
			return false;
		else
			return true;
	}
	
	public Boolean comparePassword (String pwd) {
		if (Encryption.encrypt(pwd).compareTo(this.password) != 0)
			return false;
		else
			return true;
	}
	
	public Boolean changePassword (String oldPwd, String newPwd) {
		if (comparePassword(oldPwd)) {
			this.password = Encryption.encrypt(newPwd);
			return true;
		} else
			return false;
	}

}
