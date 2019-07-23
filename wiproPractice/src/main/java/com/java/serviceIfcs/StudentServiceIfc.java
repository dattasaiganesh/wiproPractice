package com.java.serviceIfcs;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.model.Student;

@Service
public interface StudentServiceIfc{

	public List<Student> getAllStudents();

	public Student getStudent(String id);

	public void addStudent(Student student);

	public void putting(Student student, String id);

	public void delete(String id);
}
