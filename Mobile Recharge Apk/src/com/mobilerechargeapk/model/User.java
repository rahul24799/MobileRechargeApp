package com.mobilerechargeapk.model;

import java.util.Objects;

public class User {
	private String username;
	private String emailid;
	private long phonenumber;
	private String password;
	private Double wallet;
	private Operator operator;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getWallet() {
		return wallet;
	}
	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}
	
	
	public Operator getOperator() {
		return this.operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String emailid, long phonenumber, String password, Double wallet, Operator operator) {
		super();
		this.username = username;
		this.emailid = emailid;
		this.phonenumber = phonenumber;
		this.password = password;
		this.wallet = wallet;
		this.operator = operator;
	}
	
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", emailid=" + emailid + ", phonenumber=" + phonenumber + ", password="
				+ password + ", wallet=" + wallet + ", operator=" + operator + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailid, operator, phonenumber, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(emailid, other.emailid) && Objects.equals(operator, other.operator)
				&& phonenumber == other.phonenumber && Objects.equals(username, other.username);
	}
	
}	
	
