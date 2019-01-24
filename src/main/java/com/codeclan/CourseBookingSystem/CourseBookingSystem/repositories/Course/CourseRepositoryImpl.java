package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Course;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Course;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Customer;
import com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer.CustomerRepositoryCustom;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Course> getAllCoursesByCustomer(Long customerId) {
        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.customer.id", customerId));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }
}
