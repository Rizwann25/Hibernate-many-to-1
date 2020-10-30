package com.atmecs.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

		
		@Entity
		@Table(name = "user")
		
	public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "userId")
	private int userId;

	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	public User()
	{
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}


	}
		//@Column(name="profileId")
		//private int profileId;

		//
		//@OneToOne(cascade = CascadeType.ALL)
		//@JoinColumn(name="profileId")
		//private Profile profile;
