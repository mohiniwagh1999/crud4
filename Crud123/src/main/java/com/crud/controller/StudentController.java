package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Student;
import com.crud.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<String> insert(@RequestBody Student student)
	{
		String s1=studentService.upsert(student);
		return new ResponseEntity<>(s1,HttpStatus.CREATED);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> update(@RequestBody Student student)
	{
		String s1=studentService.upsert(student);
		return new ResponseEntity<>(s1,HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getById(@PathVariable Integer id)
	{
		Student byId = studentService.findById(id);
		
		return new ResponseEntity<>(byId,HttpStatus.OK);
	}
	
	@GetMapping("/student")
	
	public ResponseEntity<List<Student> > getAll()
	{
		List<Student> allStudent = studentService.findAllStudent();
		
		return new ResponseEntity<>(allStudent,HttpStatus.OK);
	}
	
	@DeleteMapping("student/{id}")
	public  ResponseEntity<String > delete(@PathVariable Integer id)
	{
		String deleteById = studentService.deleteById(id);
		
		return new ResponseEntity<>( deleteById,HttpStatus.OK);
	}
	
	
	
}
