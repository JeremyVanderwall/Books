package com.story.templet.beans;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StoryTemplet {
	@Id
	String _id;
	List<String> pages;
	List<String> wordTypes;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public List<String> getPages() {
		return pages;
	}
	public void setPages(List<String> pages) {
		this.pages = pages;
	}
	public List<String> getWordTypes() {
		return wordTypes;
	}
	public void setWordTypes(List<String> wordTypes) {
		this.wordTypes = wordTypes;
	}

}
