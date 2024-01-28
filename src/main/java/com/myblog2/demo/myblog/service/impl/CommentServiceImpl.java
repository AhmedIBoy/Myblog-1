package com.myblog2.demo.myblog.service.impl;

import com.myblog2.demo.myblog.DTO.CommentDto;
import com.myblog2.demo.myblog.entity.Comment;
import com.myblog2.demo.myblog.entity.Post;
import com.myblog2.demo.myblog.exception.ResourseNotFoundException;
import com.myblog2.demo.myblog.repository.CommentRepository;
import com.myblog2.demo.myblog.repository.PostRepository;
import com.myblog2.demo.myblog.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private PostRepository postRepo;
    private CommentRepository commentRepo;

    public CommentServiceImpl(PostRepository postRepo, CommentRepository commentRepo) {
        this.postRepo = postRepo;
        this.commentRepo = commentRepo;
    }

    @Override
    public CommentDto createComment(CommentDto commentDto, long postId) {
        Post post = postRepo.findById(postId).orElseThrow(() -> new ResourseNotFoundException("Resource Not Found With Post_Id : " + postId));
        Comment comment = new Comment();
        comment.setTittle(commentDto.getTittle());
        comment.setEmail(comment.getEmail());
        comment.setPost(post);
        Comment savedComment = commentRepo.save(comment);
        CommentDto commentDto1 = new CommentDto();
        commentDto1.setTittle(savedComment.getEmail());
        commentDto1.setEmail(savedComment.getEmail());
        return commentDto1;
    }

    public CommentDto mapTOCommentDto(Comment comment){
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setTittle(comment.getTittle());
        commentDto.setEmail(comment.getEmail());
        return commentDto;
    }

    public Comment mapTOComment(CommentDto commentDto){
        Comment comment = new Comment();
        comment.setTittle(commentDto.getTittle());
        comment.setEmail(commentDto.getEmail());
        return comment;
    }
}
