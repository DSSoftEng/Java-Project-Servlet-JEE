package com.beans;

public class user {
	@Override
	public String toString() {
		return "user [idUser=" + idUser + ", password=" + password + ", username=" + username + "]";
	}
	private int idUser;
	private String password;
	private String username;
	
	public user() {}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
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
	public user(int idUser, String password, String username) {
		super();
		this.idUser = idUser;
		this.password = password;
		this.username = username;
	}
}
