package com.examplespringtest.springtest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.examplespringtest.springtest.entities.Course;
@Service

public class CourseServiceimpi implements CourseService {
	
	List<Course> list;
	public CourseServiceimpi()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"My First Application", "In Spring Boot"));
		list.add(new Course(4343,"spring boot course","creating "));
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Course getCourse(long courseId)
	{
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c = course;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}