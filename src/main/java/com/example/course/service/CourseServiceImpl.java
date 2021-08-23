package com.example.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.course.entity.Course;
import com.example.course.repo.CourseRepo;

@Component
public class CourseServiceImpl implements CourseService {
	
	@Autowired private CourseRepo courserepo;

	@Override
	public List<Course> getCourses() {
		
		return this.courserepo.findAll();
	}

	@Override
	public Course getCourseById(int id) {
		
		
		return this.courserepo.findById((long) id).get();
	}

	@Override
	public Course addCourse(Course course) {
		
		return this.courserepo.save(course);
	}

	@Override
	public Course deleteCourseById(int id) {
		 courserepo.deleteById((long) id);
		return null;
		
		
	}

}
