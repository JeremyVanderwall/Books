package com.story.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.story.repos.StoryTempletRepo;
import com.story.repos.WordRepo;
import com.story.templet.beans.StoryTemplet;
import com.story.templet.beans.Words;

@Service
public class StoryTempletService {
	
	@Autowired
	StoryTempletRepo db;
	
	@Autowired
	WordRepo wordDb; 

	/**
	 * Get a specific page of a specific story	
	 * @param story story to fetch from
	 * @param page page to fetch
	 * @return String representation of a html story page
	 */
	public String getPage(String story, int pageNumber) {
		//query DB
		Optional<StoryTemplet> sto = db.findById(story);
		//get Story templet from story templet optional
		StoryTemplet st = sto.get();
		//get the page
		String page = st.getPages().get(pageNumber);
		return page;
	}

	/**
	 * get a list of words based on type
	 * @param wordType type of words to get
	 * @return List of words of given type
	 */
	public List<String> getWords(String wordType) {
		//query db
		Optional<Words> myWords = wordDb.findById(wordType);
		//get words object from optional
		Words myWords2 = myWords.get();
		//get list from words object
		List<String> results = myWords2.getWords();
		return results;
	}
	
	

}
