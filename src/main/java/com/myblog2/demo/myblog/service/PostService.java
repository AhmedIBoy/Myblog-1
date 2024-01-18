package com.myblog2.demo.myblog.service;

import com.myblog2.demo.myblog.DTO.PostDto;

import java.util.List;

public interface PostService {

    PostDto CreatePost(PostDto postDto);

    PostDto GetPostById(long id);

    List<PostDto> GetAllPost(int pageNo, int pageSize);

    void deletePostById(long id);

    PostDto updatePost(PostDto postDto,long id);
}
