package com.ghsoft.springboot.domain.posts;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This is the class to help Posts class to connect to DB
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {


}
