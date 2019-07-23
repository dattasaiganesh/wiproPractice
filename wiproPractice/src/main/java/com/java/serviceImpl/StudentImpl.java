package com.java.serviceImpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.serviceIfcs.*;
import com.java.StudentDaoIfc.StudentDaoIfc;
import com.java.exceptions.DataNotFoundException;
import com.java.model.Student;

@Service
public class StudentImpl implements StudentServiceIfc{
	
	@Autowired
	StudentDaoIfc studentDaoIfc;
	
	        
	public List<Student> getAllStudents() {
		List<Student> student = new ArrayList<>();
		studentDaoIfc.findAll()
		.forEach(student::add);
		return student;
	}


	@Override
	public Student getStudent(String id) throws DataNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("  ********************* id is" +id);
		Student stude = new Student();
         if(id == null) {
        	  throw new DataNotFoundException(id);
         }
			stude = studentDaoIfc.findOne(id);
			System.out.println(stude.getFirstName());
			System.out.println(stude.getSecondName());
			
		
		
		return stude;
	}


	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDaoIfc.save(student);
		
	}


	@Override
	public void putting(Student student, String id) {
		// TODO Auto-generated method stub
		studentDaoIfc.save(student);
	}


	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		studentDaoIfc.delete(id);
		
	}

}
