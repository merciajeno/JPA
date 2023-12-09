package com.example.in30minutes.jpahibernate.course;

public class Course {
	
	int id;
	String author;
	String course;
	@Override
	public String toString() {
		return "Course [id=" + id + ", author=" + author + ", course=" + course + "]";
	}
	public Course(int id, String author, String course) {
		super();
		this.id = id;
		this.author = author;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
