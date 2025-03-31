package com.spring.rest_api_assignment.springboot_rest_api_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest_api_assignment.springboot_rest_api_assignment.model.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}
