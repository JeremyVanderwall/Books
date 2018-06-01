package com.story.userStory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.story.userStory.beans.UserStory;
import com.story.userStory.repos.UserStoryRepo;

@Service
public class UserStoryService {
	@Autowired
	UserStoryRepo db;

	public UserStory getUserStory(String storyId) {
		//query db
		Optional<UserStory> uso = db.findById(storyId);
		//get user story from optional
		UserStory us = uso.get();
		return us;
	}

	public List<UserStory> getStories(String userName) {
		List<UserStory> usl = db.findByUserName(userName);
		return usl;
	}

	public UserStory saveStory(UserStory us) {
		
		return db.save(us);
	}

}
