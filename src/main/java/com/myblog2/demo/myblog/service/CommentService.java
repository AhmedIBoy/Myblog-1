package com.myblog2.demo.myblog.service;

import com.myblog2.demo.myblog.DTO.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long postId);
}
