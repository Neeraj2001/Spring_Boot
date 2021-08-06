package com.student.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<Student> students = new ArrayList<>(Arrays.asList(
			new Student(1,"Neeraj","K18KK","AB+",8.5),
			new Student(2,"Bravo","K18KK","AB-",9),
			new Student(3,"Guru","K18KL","O+",8)));
	public List<Student> getAllStudents(){
		return students;
	}
	
	public Student getStudent(Integer id) {
		return students.stream().filter(a->a.getId()==id).findFirst().get();
		
		
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(Integer id, Student student) {
		for(int i=0;i<students.size();i++)
		{
			Student s = students.get(i);
			if(s.getId()==id) {
				students.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(Integer id) {
		students.removeIf(a->a.getId()==id);
	}

}
