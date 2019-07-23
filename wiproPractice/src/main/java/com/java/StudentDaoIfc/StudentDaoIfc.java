package com.java.StudentDaoIfc;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Student;

@Repository
public interface StudentDaoIfc extends CrudRepository<Student, String> {


}
