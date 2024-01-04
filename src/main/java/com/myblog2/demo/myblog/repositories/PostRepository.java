package com.myblog2.demo.myblog.repositories;

import com.myblog2.demo.myblog.entity.Post_Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post_Test,Long> {
}
