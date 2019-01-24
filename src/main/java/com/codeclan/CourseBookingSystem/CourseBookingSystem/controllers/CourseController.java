package com.codeclan.CourseBookingSystem.CourseBookingSystem.controllers;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/ofrating/{starRating}")
    public List<Course> getAllCoursesByStarRating(@PathVariable int starRating){
       return courseRepository.getCoursesByStarRating(starRating);
    }

    @GetMapping("/customer/{id}")
    public List<Course> getAllCoursesByCustomer(@PathVariable Long id){
        return courseRepository.getAllCoursesByCustomer(id);
    }
}
