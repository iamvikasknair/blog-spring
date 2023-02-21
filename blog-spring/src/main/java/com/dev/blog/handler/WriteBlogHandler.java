package com.dev.blog.handler;

import com.dev.blog.dto.BlogDTO;
import com.dev.blog.model.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WriteBlogHandler
{
    @Autowired
    MongoRepository<Blog,String> blogRepository;
 private static final Logger LOG = LoggerFactory.getLogger(WriteBlogHandler.class);
@RequestMapping(path = "/write",method = RequestMethod.POST)
 public ResponseEntity<?> writeBlog(@RequestBody Blog blogEntry){
   LOG.info("Creating a new blog");
   LOG.info("The blog is - {}",blogEntry);
   blogRepository.save(blogEntry);
   return ResponseEntity.ok().build();

 }
}
