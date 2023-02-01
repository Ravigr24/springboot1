package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/course")
	 public List<Course> retriveALlCourses(){
		return Arrays.asList(
				new Course(1,"LearnAWS","rajuu"),
				new Course(2,"Learn Devops","Kiran"),
				new Course(3, "Learn Spring", "babu")
				);
	}
}
