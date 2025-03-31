package com.spring.rest_api_assignment.springboot_rest_api_assignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest_api_assignment.springboot_rest_api_assignment.exception.InvalidIdException;
import com.spring.rest_api_assignment.springboot_rest_api_assignment.model.Courses;
import com.spring.rest_api_assignment.springboot_rest_api_assignment.repository.CoursesRepository;

@Service
public class CoursesService {

	@Autowired
	CoursesRepository coursesRepository;
	
	public Courses addCourse(Courses courses) {
		return coursesRepository.save(courses);
	}

	public List<Courses> getAllCourses() {
		return coursesRepository.findAll();
	}

	public Courses getCourseById(int id) throws InvalidIdException {
		Optional<Courses> optional =  coursesRepository.findById(id);
		if(optional.isEmpty())
			throw new InvalidIdException("ID given is Invalid...");
		return optional.get();
	}

}
