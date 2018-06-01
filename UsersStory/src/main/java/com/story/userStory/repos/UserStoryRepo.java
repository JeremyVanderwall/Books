package com.story.userStory.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.story.userStory.beans.UserStory;

@Repository
public interface UserStoryRepo extends MongoRepository<UserStory, String> {

	List<UserStory> findByUserName(String userName);

}
