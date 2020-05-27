package com.mongodb.mongoprogram.repository;

import com.mongodb.mongoprogram.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
