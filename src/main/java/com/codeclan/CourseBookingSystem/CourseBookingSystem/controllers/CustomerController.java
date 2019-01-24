package com.codeclan.CourseBookingSystem.CourseBookingSystem.controllers;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/course/{id}")
    public List<Customer> getAllCustomerByCourses(@PathVariable Long id){
        return customerRepository.getAllCustomersByCourse(id);
    }

    @GetMapping("/town/{town}/course/{id}")
    public  List<Customer> getAllCustomersByTownAndCourse(@PathVariable String town, @PathVariable Long id){
        return customerRepository.getAllCustomersByTownAndCourse(town, id);
    }

    @GetMapping("/aboveage/{age}/town/{town}/course/{id}")
    public  List<Customer> getAllCustomersAboveAgeByTownAndCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long id){
        return customerRepository.getAllCustomersOverAgeByTownAndBYCourse(age, town, id);
    }
}
