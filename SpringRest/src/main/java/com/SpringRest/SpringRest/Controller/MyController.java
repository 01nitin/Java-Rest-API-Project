package com.SpringRest.SpringRest.Controller;
import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.SpringRest.SpringRest.Entities.Course;
import com.SpringRest.SpringRest.Services.CourseServices;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseservice;
	
	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseservice.getCourses();
		
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/courses")
	public Course AddCourse(@RequestBody Course course) {
		return this.courseservice.addCourse(course);
	}

}
