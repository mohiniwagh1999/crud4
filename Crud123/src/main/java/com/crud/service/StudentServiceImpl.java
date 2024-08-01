package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Student;
import com.crud.repo.StudentRepo;



@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public String upsert( Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
		return "successfully created";
	}

	@Override
	public Student findById( Integer id) {
		// TODO Auto-generated method stub
		
		
		Optional<Student> byId = studentRepo.findById(id);
		if(byId.isPresent())
		{
			return  byId.get() ;
		}
		
		return null;
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		
		
		List<Student> all = studentRepo.findAll();
		
		return all;
		
	}

	@Override
	public String deleteById(  Integer id) {
		// TODO Auto-generated method stub
		if(studentRepo.existsById(id))
		{
			studentRepo.deleteById(id);
			
			return "sucessfully deleted";
		}
		return "not found";		
				
	
	}
	
	

}
