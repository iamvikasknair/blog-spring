package com.dev.blog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.dev.blog.model.Blog;

public interface BlogRepository extends MongoRepository<Blog, String> {
	
	@Query(value="{author:?0}")
	List<Blog> fingBlogByAuthor(String author);

	

}
