package com.SpringRest.SpringRest.Services;

import java.util.*;

import com.SpringRest.SpringRest.Entities.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseServicesImplement implements CourseServices{
	List<Course> list;
	public CourseServicesImplement() {
		list = new ArrayList<>();
		list.add(new Course (145, "java course", "This is the java courses"));
		list.add(new Course(233, "Spring boot", "This is the Spring boot couses"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null ;
		for(Course course:list) {
			if(course.getId()== courseId) {
				c= course;
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
