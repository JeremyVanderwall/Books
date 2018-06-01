package com.story.userStory.beans;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserStory {
	@Id
	String _id;
	String userName;
	String storyTemplet;
	List<Integer> pages;
	List<String> words;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStoryTemplet() {
		return storyTemplet;
	}
	public void setStoryTemplet(String storyTemplet) {
		this.storyTemplet = storyTemplet;
	}
	public List<Integer> getPages() {
		return pages;
	}
	public void setPages(List<Integer> pages) {
		this.pages = pages;
	}
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}

}
