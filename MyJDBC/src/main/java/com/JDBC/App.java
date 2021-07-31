package com.JDBC;


import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.dao.StudentDAO;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("jdbcApplication.xml");
    	
    	
    	StudentDAO dao= context.getBean("studentDao",StudentDAO.class);
    	
    	
    	/*Student std=new Student(106,"Zaki", 30, "bangalore");
    	
    	
    	dao.addStudent(std);
    	
    	
    	System.out.println("successfully");*/
    	
    	/*Student st= dao.getStudent(105);
    	System.out.println(st.getId()+" "+st.getName()+" "+st.getAge()+" "+st.getCity());
    	*/
    	
    	//dao.updateStudent(32, 102);
    	
    	//dao.deleteStudent(102);

   	List<Student> stdList=dao.listStudent();
    	for(Student s:stdList)
    		System.out.println(s.getId()+" "+s.getName()+" "+s.getAge()+" "+s.getCity());
    }
}
