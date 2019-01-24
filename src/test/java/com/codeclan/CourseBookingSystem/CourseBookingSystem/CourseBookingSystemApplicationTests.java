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

	@Test
	public void getBookingsByDate(){
		assertEquals(3, bookingRepository.getBookingsByDate("30-02-2100").size());
		assertEquals(0, bookingRepository.getBookingsByDate("29-02-2100").size());
	}

	@Test
	public void getCustomersByCourse(){
		assertEquals(2, customerRepository.getAllCustomersByCourse(1L).size());
	}

	@Test
	public void getCoursesByCustomer(){
		assertEquals(2, courseRepository.getAllCoursesByCustomer(1L).size());
	}

	@Test
	public void getCustomersByCourseAndTown(){
		assertEquals(1, customerRepository.getAllCustomersByTownAndCourse("Bonnyrigg", 1L).size());
	}

	@Test
	public void getCustomersOverAgeByCourseAndTown(){
		assertEquals(0, customerRepository.getAllCustomersOverAgeByTownAndBYCourse(27, "Bonnyrigg", 1L).size());
		assertEquals(1, customerRepository.getAllCustomersOverAgeByTownAndBYCourse(25, "Bonnyrigg", 1L).size());
	}

}

