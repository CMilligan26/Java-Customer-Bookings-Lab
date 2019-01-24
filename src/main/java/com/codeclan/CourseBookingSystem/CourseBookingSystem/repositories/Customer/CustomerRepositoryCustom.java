package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer;


import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllCustomersByCourse(Long courseId);
    List<Customer> getAllCustomersByTownAndCourse(String town, Long courseId);
    List<Customer> getAllCustomersOverAgeByTownAndBYCourse(int age, String town, Long courseId);
}
