package com.myblog2.demo.myblog.service;

import com.myblog2.demo.myblog.DTO.PostDto;
import com.myblog2.demo.myblog.util.PostResponse;

import java.util.List;

public interface PostService {

    PostDto CreatePost(PostDto postDto);

    PostDto GetPostById(long id);

    PostResponse GetAllPost(int pageNo, int pageSize, String sortBy, String sortDir);

    void deletePostById(long id);

    PostDto updatePost(PostDto postDto,long id);
}
