package com.myblog2.demo.myblog.service;

import com.myblog2.demo.myblog.DTO.PostDto;

public interface PostService {

    PostDto CreatePost(PostDto postDto);

    PostDto GetPostById(long id);
}
