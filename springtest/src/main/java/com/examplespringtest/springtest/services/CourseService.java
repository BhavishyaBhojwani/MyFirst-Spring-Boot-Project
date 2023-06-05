package com.examplespringtest.springtest.services;

import java.util.List;

import com.examplespringtest.springtest.entities.Course;


public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(long courseID);
	
	public Course addCourse(Course course);
	
	
}