package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Course;


import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getAllCoursesByCustomer(Long customerId);
}
