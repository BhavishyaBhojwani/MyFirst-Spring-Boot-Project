package com.examplespringtest.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examplespringtest.springtest.entities.Course;
import com.examplespringtest.springtest.services.CourseService;

@RestController
public class MuyController {
	@Autowired
	
	private CourseService courseService;

	@GetMapping("/home")
	public String home()
	{
		return "this is homepage";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List <Course> getCourses()
	{	
		return this.courseService.getCourses();
		
	}
	//for getting single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
				
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
		
	}
}
