package com.SuperHero_Mohamed_Mohamed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Login {
	@Id
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "password", nullable = false)
	private String password;

	@Transient
	private String verifyPassword;

	public Login() {
		super();
	}

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	// getter and setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((verifyPassword == null) ? 0 : verifyPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (verifyPassword == null) {
			if (other.verifyPassword != null)
				return false;
		} else if (!verifyPassword.equals(other.verifyPassword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", verifyPassword=" + verifyPassword + "]";
	}
}
