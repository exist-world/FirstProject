package com.example.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Bengia_Course")
public class BengiaCourse {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String email;
	
	private int number;
	
	public BengiaCourse() {
		
	}

	public BengiaCourse(String name, String email, int number) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Bengia_Course [name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
	
	

}
