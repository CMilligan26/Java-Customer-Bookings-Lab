package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Course;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> getCoursesByStarRating(int starRating);
}
