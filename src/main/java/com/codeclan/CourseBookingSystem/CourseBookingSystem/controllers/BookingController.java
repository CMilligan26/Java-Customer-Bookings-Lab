package com.codeclan.CourseBookingSystem.CourseBookingSystem.controllers;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Booking;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Booking.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/dateof/{date}")
    public List<Booking> getAllBookingsByDate(@PathVariable String date){
       return bookingRepository.getBookingsByDate(date);
    }
}
