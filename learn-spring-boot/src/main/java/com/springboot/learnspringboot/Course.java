package com.springboot.learnspringboot;

public class Course {
	private int id;
	private String cname;
	private String author;
	
	
	
	public Course(int id, String cname, String author) {
		super();
		this.id = id;
		this.cname = cname;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public String getCname() {
		return cname;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + ", author=" + author + "]";
	}
	
	
	

}
