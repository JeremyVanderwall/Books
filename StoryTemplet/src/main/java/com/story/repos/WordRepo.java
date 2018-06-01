package com.story.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.story.templet.beans.Words;

@Repository
public interface WordRepo extends MongoRepository<Words, String> {

}
