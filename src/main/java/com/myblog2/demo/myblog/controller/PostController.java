package com.myblog2.demo.myblog.controller;

import com.myblog2.demo.myblog.paylod.PostDto;
import com.myblog2.demo.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post_testing")
public class PostController {

    private  PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> CreatePost_testing(@RequestBody PostDto postDto){
        PostDto SavedPost = postService.createPost(postDto);
        return new ResponseEntity<>(SavedPost, HttpStatus.CREATED);
    }
}
