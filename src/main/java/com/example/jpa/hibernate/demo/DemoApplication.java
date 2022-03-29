package com.example.jpa.hibernate.demo;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.hibernate.demo.entity.BengiaCourse;
import com.example.jpa.hibernate.demo.repository.CourseRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.EntityManager();
		//BengiaCourse course = repository.findById(7);	
		
		//logger.info("Course 100->{}",course);
	//repository.deleteById(53);
		//repository.save(new BengiaCourse("monika","moni@gmail.com",11362727));
		
	}

}
