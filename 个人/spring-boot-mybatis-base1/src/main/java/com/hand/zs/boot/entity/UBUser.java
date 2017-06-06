package com.hand.zs.boot.entity;

public class UBUser {
	private Integer ubuserId;
	private String username;
	private String firstName;
	private char sex;
	private Integer age;

	public Integer getUbuserId() {
		return ubuserId;
	}

	public void setUbuserId(Integer ubuserId) {
		this.ubuserId = ubuserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
