package com.codeclan.CourseBookingSystem.CourseBookingSystem.components;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Booking.BookingRepository;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Course.CourseRepository;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Christopher Milligan", "Bonnyrigg", 26);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Paul Wishart", "Cellardyke", 32);
        customerRepository.save(customer2);

        Course course1 = new Course("Intro To Spring", "Edinburgh", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Advanced Spring", "Glasgow", 2);
        courseRepository.save(course2);

        Booking booking1 = new Booking("30-02-2100", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("30-02-2100", course1, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("30-02-2100", course2, customer1);
        bookingRepository.save(booking3);
    }
}
