package com.myblog2.demo.myblog.controller;

import com.myblog2.demo.myblog.DTO.PostDto;
import com.myblog2.demo.myblog.service.PostService;
import com.myblog2.demo.myblog.util.PostResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<PostResponse> getAllPosts
            (
                @RequestParam(name = "pageNo",required = false,defaultValue = "0") int pageNo,
                @RequestParam(name = "pageSize",required = false,defaultValue = "3") int pageSize,
                @RequestParam(name = "sortBy", required = false, defaultValue = "id") String sortBy,
                @RequestParam(name = "sortDir", required = false,defaultValue = "id") String sortDir
            ){
        PostResponse postResponse = postService.GetAllPost(pageNo, pageSize, sortBy, sortDir);
        return new ResponseEntity<>(postResponse,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteByIdPost(@PathVariable Long id){
        postService.deletePostById(id);
        return new ResponseEntity<>("Post Is Deleted Successfully..!",HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto,@PathVariable long id){
        PostDto postDto1 = postService.updatePost(postDto, id);
        return new ResponseEntity<>(postDto1,HttpStatus.CREATED);
    }
}
