package com.dev.blog.handler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.blog.dto.BlogDTO;
import com.dev.blog.model.Blog;
import com.dev.blog.repository.BlogRepository;

@RestController

public class ReadBlogHandler {
	
	@Autowired
	private MongoRepository<Blog, String> blogRepository;
	
	@ResponseBody
	@RequestMapping(path = "/read",method = RequestMethod.GET)
	
	public ResponseEntity<BlogDTO> readBlog(){
		BlogDTO dto = new BlogDTO();
		dto.setAuthor("Vikas");
		dto.setBlogText("Sample Blog to get started.");
		dto.setTitle("SAMPLE");
		dto.setDate(new Date());
		return new ResponseEntity<BlogDTO>(dto,HttpStatus.OK);
	}
	
	
	@ResponseBody
	@RequestMapping(path = "/readBlog",method = RequestMethod.GET)
	public List<Blog> readBlogFromDb(){
		List<Blog> blog = blogRepository.findAll();
		return blog;
	}
}
