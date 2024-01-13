package com.myblog2.demo.myblog.controller;

import com.myblog2.demo.myblog.DTO.PostDto;
import com.myblog2.demo.myblog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/postTesting")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPosts(@RequestBody PostDto postDto){
        PostDto postDto1 = postService.CreatePost(postDto);
        return new ResponseEntity<>(postDto1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable long id){
        PostDto postDto = postService.GetPostById(id);
        return new ResponseEntity<>(postDto,HttpStatus.OK);
    }
}
