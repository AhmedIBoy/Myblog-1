package com.myblog2.demo.myblog.repository;

import com.myblog2.demo.myblog.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    //Add additional Query----
}
