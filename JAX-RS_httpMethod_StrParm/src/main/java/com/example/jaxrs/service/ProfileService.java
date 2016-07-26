package com.example.jaxrs.service;

import java.util.List;

import com.example.jaxrs.beans.Profile;

public interface ProfileService {

	public List<Profile> getAllProfile();

	public Profile getProfile(String profileName);

	public Profile addProfile(Profile profile);

	public Profile modifyProfile(Profile profile);

	public Profile deleteProfile(String profileName);
}
