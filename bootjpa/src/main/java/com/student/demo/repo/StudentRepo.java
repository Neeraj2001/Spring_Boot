package com.student.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.student.demo.model.Student;

public interface StudentRepo extends CrudRepository<Student,Integer>
{

}
