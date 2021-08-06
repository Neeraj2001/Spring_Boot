package com.student.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // controls the rest
public class StudentControllerApi {

	@Autowired
	StudentService studentservice;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		
		return studentservice.getAllStudents();
		
	}
	
	@RequestMapping("/students/{id}")
    public Student getStudent(@PathVariable Integer id) {
    	return studentservice.getStudent(id);
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
	}
	
	//pathvariable is used to extract the value from the uri.
	//requestbody is used to converet to java object from json
	//autowired is used to autowire the bean and we dont even have to write new
	//requestmapping is used to map the Http request
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable Integer id) {
		studentservice.updateStudent(id, student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
    public void deleteStudent(@PathVariable Integer id) {
    	studentservice.deleteStudent(id);
    }
}
