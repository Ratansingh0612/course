package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entity.Course;
import com.example.course.service.CourseService;
@RestController
public class MyController {

	@Autowired
	private CourseService courseservice;

	@PostMapping("/addCourse")
	public Course addBook(@RequestBody Course course) {

		return courseservice.addCourse(course);

	}

	@GetMapping("/getAllcourses")
	List<Course> getAllcourses() {

		return courseservice.getCourses();

	}

	@GetMapping("/getcourseById/{id}")
	Course getCourseById(@PathVariable("id") int Id) {

		return courseservice.getCourseById(Id);

	}

	@GetMapping("/deletecourse/{id}")
	Course deleteCourse(@PathVariable("id") int Id) {

		return courseservice.getCourseById(Id);

	}

}
