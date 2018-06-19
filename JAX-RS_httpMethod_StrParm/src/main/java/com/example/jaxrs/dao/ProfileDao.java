package com.example.jaxrs.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.jaxrs.beans.Profile;

public class ProfileDao {

	public static Map<String, Profile> profiles = new HashMap<String, Profile>();

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
