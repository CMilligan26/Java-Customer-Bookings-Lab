package com.codeclan.CourseBookingSystem.CourseBookingSystem;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Booking.BookingRepository;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Course.CourseRepository;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getCoursesByStarRating(){
		assertEquals(1, courseRepository.getCoursesByStarRating(3).size());
	}

}

