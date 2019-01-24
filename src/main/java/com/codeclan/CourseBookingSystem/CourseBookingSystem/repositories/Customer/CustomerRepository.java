package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
