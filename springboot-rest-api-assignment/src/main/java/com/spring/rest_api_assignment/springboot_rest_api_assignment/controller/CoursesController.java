package com.spring.rest_api_assignment.springboot_rest_api_assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest_api_assignment.springboot_rest_api_assignment.dto.MessageResponseDto;
import com.spring.rest_api_assignment.springboot_rest_api_assignment.model.Courses;
import com.spring.rest_api_assignment.springboot_rest_api_assignment.service.CoursesService;

@RestController
public class CoursesController {

	@Autowired
	CoursesService coursesService;
	
	@Autowired
	MessageResponseDto messageDto;
	
	@PostMapping("/api/course/add")
	public Courses addCourse(@RequestBody Courses courses) {
		return coursesService.addCourse(courses);
	}
	
	@GetMapping("/api/course/getall")
	public List<Courses> getCourses() {
		return coursesService.getAllCourses();	
	}
	
	@GetMapping("/api/course/one/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable int id) {
		try {
			Courses courses = coursesService.getCourseById(id);
			return ResponseEntity.ok(courses);	
		} catch (Exception e) {
			messageDto.setBody(e.getMessage());
			messageDto.setStatus(400);
			return ResponseEntity.status(400).body(messageDto);
			
		}
		
	}
	
	
}
