package com.java.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Student;
import com.java.serviceIfcs.StudentServiceIfc;

@RestController
public class StudentController {

	
	  @Autowired
	  StudentServiceIfc studentServiceIfc;
	  
	  @RequestMapping("/students")
	  public List<Student> getAllStudent() { 
		  return studentServiceIfc.getAllStudents();
	  
	  }
	 
	  @RequestMapping("/students/{id}")
	  public Student getStudent(@PathVariable String id) {
		  return studentServiceIfc.getStudent(id);
	  }

	@RequestMapping("hello")
	public String hello() {
		return "hi";
	}
	
	@RequestMapping(method= RequestMethod.POST, value= "/students")
	public void addStudent(@RequestBody Student student) {
		studentServiceIfc.addStudent(student);
		
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/students/{id}")
	public void putting(@RequestBody Student student, @PathVariable String id) {
		 studentServiceIfc.putting(student,id);
	
}
	@RequestMapping(method= RequestMethod.DELETE, value="/students/{id}")
	public void delete(@PathVariable String id) {
		studentServiceIfc.delete(id);
	}
}