package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Booking;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
