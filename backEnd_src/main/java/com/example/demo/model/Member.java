package com.example.demo.model;

import lombok.Data;

@Data
public class Member {
	private Integer id;
	private String memberno;
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;
	private String mobile;
	private String email;
	
	public Member(String memberno, String name, String username, String password, String address, String phone,
			String mobile, String email) {
		super();
		this.memberno = memberno;
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
