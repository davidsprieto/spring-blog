package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM posts WHERE user_id = ?")
    List<Post> findAllByUserId(long id);

}
