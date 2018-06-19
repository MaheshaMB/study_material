package com.example.jaxrs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.jaxrs.beans.Profile;
import com.example.jaxrs.dao.ProfileDao;

public class ProfileServiceImpl implements ProfileService {

	private Map<String, Profile> profiles = ProfileDao.getProfiles();

	public ProfileServiceImpl() {
		profiles.put("mahesha", new Profile(1l, "mahesha", "mahesh", "manu", new Date()));
	}

	@Override
	public List<Profile> getAllProfile() {
		return new ArrayList<Profile>(profiles.values());
	}

	@Override
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	@Override
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profile.setCreatedOn(new Date());
		profiles.put(profile.getProfile(), profile);
		return profile;
	}

	@Override
	public Profile modifyProfile(Profile profile) {
		profile.setCreatedOn(new Date());
		profiles.put(profile.getProfile(), profile);
		return profile;
	}

	@Override
	public Profile deleteProfile(String profileName) {
		return profiles.remove(profileName);
	}
}
