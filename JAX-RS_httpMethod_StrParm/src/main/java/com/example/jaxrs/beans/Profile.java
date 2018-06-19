package com.example.jaxrs.beans;

import java.util.Date;

public class Profile {

	private long id;
	private String profile;
	private String firstName;
	private String lastname;
	private Date createdOn;

	public Profile() {
		super();
	}

	public Profile(long id, String profile, String firstName, String lastname, Date createdOn) {
		super();
		this.id = id;
		this.profile = profile;
		this.firstName = firstName;
		this.lastname = lastname;
		this.createdOn = createdOn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", profile=" + profile + ", firstName=" + firstName + ", lastname=" + lastname
				+ ", createdOn=" + createdOn + "]";
	}
}
