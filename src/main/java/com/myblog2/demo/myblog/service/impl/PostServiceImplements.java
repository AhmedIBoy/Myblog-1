package com.myblog2.demo.myblog.service.impl;

import com.myblog2.demo.myblog.entity.Post_Test;
import com.myblog2.demo.myblog.paylod.PostDto;
import com.myblog2.demo.myblog.repositories.PostRepository;
import com.myblog2.demo.myblog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImplements implements PostService {

    private  PostRepository postRepository;

    public PostServiceImplements(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post_Test post = new Post_Test();
        post.setId(post.getId());
        post.setTittle(postDto.getTittle());
        post.setContent(postDto.getComments());
        post.setDescription(postDto.getDescription());
        Post_Test savePost = postRepository.save(post);

        PostDto dto = new PostDto();
        dto.setId(savePost.getId());
        dto.setTittle(savePost.getTittle());
        dto.setComments(savePost.getContent());
        dto.setDescription(savePost.getDescription());
        return dto;
    }
}
