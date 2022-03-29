package com.example.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;


import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.demo.entity.BengiaCourse;


@Repository
@Transactional
public class CourseRepository {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;
	
	//public Course findById(Long id)
	public BengiaCourse findById(int id)
	{
		return em.find(BengiaCourse.class, id);
	}
	
	//public Course save(Course course)-> insert and update
	public BengiaCourse save(BengiaCourse course) {
		if(course.getName()==null)
		{
			em.persist(course);
		}
		else
		{
			em.merge(course);
		}
		return course;
	}
		//public void deleteById(Long id)
	public void deleteById(int id)
	{
		BengiaCourse course=findById(id);
		em.remove(course);
	}
	
	public void EntityManager()
	{
		BengiaCourse course1=new BengiaCourse("first", "first@gmail.com", 1000000);
		em.persist(course1);
		BengiaCourse course2=new BengiaCourse("second", "second@gmail.com", 211111);
		em.persist(course2);
		
		//em.flush();
        course1.setName("UpdatedFirst");
        course2.setEmail("new@gmail.com");
		//em.flush();
		
		
		//em.refresh(course1);
		//em.flush();
		
	}
}

