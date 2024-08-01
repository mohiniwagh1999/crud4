package com.crud.service;

import java.util.List;

import com.crud.entity.Student;

public interface StudentService {
	
	
	
	public String upsert(Student student);
	
	
	public Student findById(Integer id);
	
	
	public List<Student> findAllStudent();
	
	
	public String deleteById(Integer id);

}
