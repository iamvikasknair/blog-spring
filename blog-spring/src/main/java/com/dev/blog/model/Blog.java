package com.dev.blog.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("blog")
public class Blog {
	@Id
	@Field(name = "id")
	private String id;
	private String author;
	private String date;
	private String title;

	private String blogText;
	
	

	public Blog(String id, String author, String date, String title, String blogText) {
		super();
		this.id = id;
		this.author = author;
		this.date = date;
		this.title = title;
		this.blogText = blogText;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlogText() {
		return blogText;
	}

	public void setBlogText(String blogText) {
		this.blogText = blogText;
	}
	
	

}
