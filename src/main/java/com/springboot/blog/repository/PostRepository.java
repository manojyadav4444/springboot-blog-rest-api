package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//dont need to annotate with @Repository and @Transactional since SimpleJpaRepository has both already
public interface PostRepository extends JpaRepository<Post, Long> {
}
