package com.example.jpa.hibernate.demo.repository;


import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.demo.DemoApplication;
import com.example.jpa.hibernate.demo.entity.BengiaCourse;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)

public class CourseRepositoryTest {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;
//	
//	@Test
//	@DirtiesContext
//	public void findById_basic() {
//		BengiaCourse course=repository.findById(100);
//		assertEquals("Bengia cheche",course.getName());
//	}
//	
//	@Test
//	@DirtiesContext
//	public void deleteById_basic() {
//		repository.deleteById(94);
//		assertNull(repository.findById(94));
//	}
//	
//	@Test
//	@DirtiesContext
//	public void save_basic() {
//		//get a course
//		BengiaCourse course=repository.findById(93);
//		assertEquals("rahul",course.getName());
//		
//		//update details
//		course.setName("same");
//		repository.save(course);
//		
//		//check the value
//		
//		BengiaCourse course1=repository.findById(93);
//		assertEquals("same",course1.getName());
//	}
//	
//
//	
	@Test
	@DirtiesContext
	public void EntityManager() {
		
		repository.EntityManager();
		{
	    }
	}
	

}
