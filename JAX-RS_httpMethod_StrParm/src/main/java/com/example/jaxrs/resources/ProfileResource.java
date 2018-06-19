package com.example.jaxrs.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.jaxrs.beans.Profile;
import com.example.jaxrs.service.ProfileService;
import com.example.jaxrs.service.ProfileServiceImpl;

@Path("/profile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

	private ProfileService profileService = new ProfileServiceImpl();

	@GET
	public List<Profile> getAllProfileResource() {
		return profileService.getAllProfile();
	}

	@POST
	public Profile addProfileResource(Profile profile) {
		return profileService.addProfile(profile);
	}

	@PUT
	@Path("/{profileName}")
	public Profile updateProfileResource(@PathParam("profileName") String profileName, Profile profile) {
		profile.setProfile(profileName);
		return profileService.modifyProfile(profile);
	}

	@DELETE
	@Path("/{profileName}")
	public Profile updateProfileResource(@PathParam("profileName") String profileName) {
		return profileService.deleteProfile(profileName);
	}

	@GET
	@Path("/{profileName}")
	public Profile getSpecifiedProfile(@PathParam("profileName") String profileName) {
		return profileService.getProfile(profileName);
	}

}
