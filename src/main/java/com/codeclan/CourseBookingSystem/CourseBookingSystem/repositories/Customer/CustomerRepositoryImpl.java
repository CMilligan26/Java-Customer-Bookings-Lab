package com.codeclan.CourseBookingSystem.CourseBookingSystem.repositories.Customer;

import com.codeclan.CourseBookingSystem.CourseBookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Customer> getAllCustomersByCourse(Long courseId) {
        List<Customer> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", courseId));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }
}
