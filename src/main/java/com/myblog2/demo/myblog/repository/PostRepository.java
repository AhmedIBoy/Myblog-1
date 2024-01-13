package com.myblog2.demo.myblog.repository;

import com.myblog2.demo.myblog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
