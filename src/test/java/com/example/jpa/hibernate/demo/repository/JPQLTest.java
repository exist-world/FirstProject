package com.example.jpa.hibernate.demo.repository;


import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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

public class JPQLTest {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	@Test
	@DirtiesContext
	public void jpql_basic() {
		Query query =em.createQuery("Select c From BengiaCourse c");
		List resultList=query.getResultList();
		logger.info("Select c From BengiaCourse c ->{}",resultList);
	}
	@Test
	@DirtiesContext
	public void jpql_typed() {
		TypedQuery<BengiaCourse> query=em.createQuery("Select c From BengiaCourse c", BengiaCourse.class);
		List<BengiaCourse> resultList=query.getResultList();
		logger.info("Select c From BengiaCourse c ->{}",resultList);
	}
	
	@Test
	@DirtiesContext
	public void jpql_where() {
		TypedQuery<BengiaCourse> query=
		em.createQuery("Select c From BengiaCourse c where name like '%Bengia cheche'", BengiaCourse.class);
		List<BengiaCourse> resultList=query.getResultList();
		logger.info("Select c From BengiaCourse c where name like '%Bengia cheche'->{}",resultList);
	}
	
	
	
	
	
	}
	

