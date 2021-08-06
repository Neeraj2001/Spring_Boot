package com.student.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
@Id
	private Integer id;
	private String name;
	private String section;
	private String bgroup;
	private double cgpa;
	
	public Student() {
        
	}
	
	public Student(Integer id, String name, String section, String bgroup, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
		this.bgroup = bgroup;
		this.cgpa = cgpa;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		section = section.toUpperCase();
		this.section = section;
	}
	
	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	
	public String getBgroup() {
		return bgroup;
	}

	public void setBgroup(String bgroup) {
		List<String> bg = new ArrayList<>();
		bg.add("O-");bg.add("O+");bg.add("AB+");
		bg.add("AB-");bg.add("B");bg.add("C");
		bgroup = bgroup.toUpperCase();
		if(!bg.contains(bgroup)) bgroup = null; 
		this.bgroup = bgroup;
	}
	

	

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ",section="]";
//	}

}
