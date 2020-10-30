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
	@Table(name = "user_profile")
	public class Profile {

	    @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="profileId")
	    private int profileId;
	    @Column(name="phoneNumber")
	    private String phoneNumber;
	    @Column(name="gender")
	    private String gender;
	   @JoinColumn(name="userId")
	   @OneToOne(cascade = CascadeType.ALL)
	        private User user;
	   
		public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Profile()
		{
			
		}

}
