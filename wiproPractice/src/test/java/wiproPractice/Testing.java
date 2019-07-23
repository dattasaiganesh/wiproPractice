package wiproPractice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.InitBinder;

import com.java.StudentDaoIfc.StudentDaoIfc;
import com.java.model.Student;
import com.java.serviceIfcs.StudentServiceIfc;

public class Testing {
	
	@Autowired
	StudentServiceIfc studentServiceIfc;
	
	
	/*
	 * StudentDaoIfc studentDaoIfc = mock(StudentDaoIfc.class);
	 */

	public void create() {
	
	}
	
	
	@Test
	public void getStudent(String id) {
		
	}

}
