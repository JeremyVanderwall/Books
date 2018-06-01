package com.story.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.story.templet.beans.StoryTemplet;

@Repository
public interface StoryTempletRepo extends MongoRepository<StoryTemplet, String> {
	

}
