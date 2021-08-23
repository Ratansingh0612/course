package com.example.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.course.entity.Course;

@Service
public interface CourseService {
	List<Course> getCourses();
     Course getCourseById(int id);
     Course addCourse(Course course);
     Course deleteCourseById(int id);
}
