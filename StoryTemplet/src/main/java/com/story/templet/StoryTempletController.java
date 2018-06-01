package com.story.templet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.story.service.StoryTempletService;

@RestController
public class StoryTempletController {
	
	@Autowired
	StoryTempletService service;
	
	/**
	 * Gets a String containing html for a single page of the story
	 * @param story the id of the story templet being used
	 * @param page page number to fetch
	 * @return String containing html for the page
	 */
	@GetMapping("/nextPage/{story}/{page}")
	public ResponseEntity<String> getPage(@PathVariable("story") String story, @PathVariable("page") int page){
		String response = service.getPage(story, page);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	/**
	 * Gets a words based on type of word requested
	 * @param wordType type of word requested
	 * @return List of words of type requested
	 */
	@GetMapping("/getWord/{wordType}")
	public ResponseEntity<List<String>> getWords(@PathVariable("wordType") String wordType){
		List<String> myWords = service.getWords(wordType);
		return new ResponseEntity<List<String>>(myWords, HttpStatus.OK);
	}

}
