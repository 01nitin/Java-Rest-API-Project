package com.SpringRest.SpringRest.Services;
import java.util.*;

import com.SpringRest.SpringRest.Entities.Course;
public interface CourseServices {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);
}
