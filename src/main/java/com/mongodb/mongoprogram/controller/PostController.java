package com.mongodb.mongoprogram.controller;

import com.mongodb.mongoprogram.domain.Post;
import com.mongodb.mongoprogram.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping(value="/savepost")
    public String savePost(@RequestBody Post post){
        postRepository.save(post);
        return "Post saved";
    }
}
