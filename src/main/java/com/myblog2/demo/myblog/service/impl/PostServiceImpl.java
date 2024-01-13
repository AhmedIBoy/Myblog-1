package com.myblog2.demo.myblog.service.impl;

import com.myblog2.demo.myblog.DTO.PostDto;
import com.myblog2.demo.myblog.entity.Post;
import com.myblog2.demo.myblog.exception.ResourseNotFoundException;
import com.myblog2.demo.myblog.repository.PostRepository;
import com.myblog2.demo.myblog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private  PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto CreatePost(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTittle(postDto.getTittle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post savePost = postRepo.save(post);

        PostDto dto = new PostDto();
        dto.setId(savePost.getId());
        dto.setContent(savePost.getContent());
        dto.setDescription(savePost.getDescription());
        dto.setTittle(savePost.getContent());

        return dto;
    }

    @Override
    public PostDto GetPostById(long id) {

        Post post = postRepo.findById(id).orElseThrow(() -> new ResourseNotFoundException("Resource Not Found With Id :" + id));

        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTittle(post.getTittle());
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
        return dto;
    }
}
