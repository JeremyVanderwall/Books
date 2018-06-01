package com.story.userStory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.story.userStory.beans.UserStory;
import com.story.userStory.service.UserStoryService;

@RestController
public class UserStoryController {
	@Autowired
	UserStoryService service;
	
	@GetMapping("/getStory/{StoryID}")
	public ResponseEntity<UserStory> getStory(@PathVariable("StoryID") String storyId){
		UserStory u = service.getUserStory(storyId);
		return new ResponseEntity<UserStory>(u, HttpStatus.OK);
	}
	
	@GetMapping("/myStories/{UserName}")
	public ResponseEntity<List<UserStory>> getMyStories(@PathVariable("UserName") String userName){
		List<UserStory> myStories = service.getStories(userName);
		return new ResponseEntity<List<UserStory>>(myStories, HttpStatus.OK);
	}
	
	@PostMapping("/saveStory")
	public ResponseEntity<UserStory> saveStory(@RequestBody UserStory us){
		us = service.saveStory(us);
		return new ResponseEntity<UserStory>(us, HttpStatus.OK);
	}

}
