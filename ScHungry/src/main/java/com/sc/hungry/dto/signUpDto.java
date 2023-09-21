package com.sc.hungry.dto;

import lombok.Data;

@Data
public class signUpDto {
	private String emailId;
	private String nickName;
	private String password;
	private String phoneNumber;
	private String idDvcd;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIdDvcd() {
		return idDvcd;
	}
	public void setIdDvcd(String idDvcd) {
		this.idDvcd = idDvcd;
	}
	
}
