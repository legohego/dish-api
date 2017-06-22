package io.dishapp.services;

import java.util.List;

import io.dishapp.models.Profile;

public interface ProfileService {

	List<Profile> getProfiles();

	Profile getProfile(String id);

	void addProfile(Profile profile);

}
