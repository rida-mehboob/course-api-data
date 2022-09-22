package com.systems.pos.courses.service;

import com.systems.pos.topics.entity.Course;
import com.systems.pos.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService
{
	
	@Autowired
	private CourseRepository courseRepository;

	 public List<Course> getAllCourses(String topicId)
	 {
		 List<Course> courses = new ArrayList<>();
		 courseRepository.findByTopicId(topicId)
		 .forEach(courses::add);
		 return courses;
	 }
	 
	 public Course getCourse(String id)
	 {
		 Optional<Course> opCourse = courseRepository.findById(id);
		 if(opCourse.isPresent())
		 {
			 return opCourse.get();
		 }
		 return null;
		
	 }
	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	public void updateCourse( Course course)
	{
		courseRepository.save(course);
		
	}
	public void deleteCourse(String id)
	{
		courseRepository.deleteById(id);
	}
}
