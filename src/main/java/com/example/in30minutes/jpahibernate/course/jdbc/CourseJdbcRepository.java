package com.example.in30minutes.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.in30minutes.jpahibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate springTemplate;
	
	private String INSERT_QUERY="""
			insert into course(id,author,course)
			values(?,?,?);
			""";
	private String DELETE_QUERY="""
		  delete from course where id=?;
			""";
	public void insert(Course course)
	{
		springTemplate
		.update(INSERT_QUERY,course.getId(),course.getAuthor(),course.getCourse());
	}
	
	public void delete(int id)
	{
		springTemplate.update(DELETE_QUERY,id);
	}

}
