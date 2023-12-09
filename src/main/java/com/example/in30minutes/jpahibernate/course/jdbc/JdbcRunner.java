package com.example.in30minutes.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.in30minutes.jpahibernate.course.Course;

@Component
public class JdbcRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Mercia","AWS"));
		repository.insert(new Course(2,"Shania","AWS"));
		repository.insert(new Course(3,"Mercia","AWS"));
		repository.delete(1);
		
	}

}
