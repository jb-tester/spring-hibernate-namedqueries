package com.example.springhibernatenamedqueries;

import com.example.springhibernatenamedqueries.hibernateQueries.Tab2Entity;
import com.example.springhibernatenamedqueries.hibernateQueries.Tab3Entity;
import com.example.springhibernatenamedqueries.jakartaQueries.Tab2EntityJ;
import com.example.springhibernatenamedqueries.jakartaQueries.Tab3EntityJ;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 8/1/2023.</p>
 * <p>Project: spring-hibernate-namedqueries</p>
 * *
 */
@Service
public class NamedQueriesTestService {

    @Autowired
    EntityManager em;

    public void nestedJakartaNamedQueriesTest() {
        System.out.println(em.createNamedQuery("NestedJakartaNamedQuery.first", Tab2EntityJ.class).getResultList());
        System.out.println(em.createNamedQuery("NestedJakartaNamedQuery.second", Tab2EntityJ.class).getResultList());
    }

    public void repeatedJakartaNamedQueriesTest() {
        System.out.println(em.createNamedQuery("RepeatedJakartaNamedQuery.first", Tab3EntityJ.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedJakartaNamedQuery.second", Tab3EntityJ.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedJakartaNamedQuery.third", Tab3EntityJ.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedJakartaNativeNamedQuery.first", Tab3EntityJ.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedJakartaNativeNamedQuery.second", Tab3EntityJ.class).getResultList());
    }

    public void nestedHibernateNamedQueriesTest() {
        System.out.println(em.createNamedQuery("NestedHibernateNamedQuery.first", Tab2Entity.class).getResultList());
        System.out.println(em.createNamedQuery("NestedHibernateNamedQuery.second", Tab2Entity.class).getResultList());
        System.out.println(em.createNamedQuery("NestedHibernateNativeNamedQuery.first", Tab2Entity.class).getResultList());
        System.out.println(em.createNamedQuery("NestedHibernateNativeNamedQuery.second", Tab2Entity.class).getResultList());
    }

    public void repeatedHibernateNamedQueriesTest() {
        System.out.println(em.createNamedQuery("RepeatedHibernateNamedQuery.first", Tab3Entity.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedHibernateNamedQuery.second", Tab3Entity.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedHibernateNativeNamedQuery.first", Tab3Entity.class).getResultList());
        System.out.println(em.createNamedQuery("RepeatedHibernateNativeNamedQuery.second", Tab3Entity.class).getResultList());
    }
}
