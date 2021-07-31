package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.Student;

public class StudentDAO {
	
	
	private JdbcTemplate jdbcTemplate;

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void addStudent(Student std){
		String sql="insert into student values(?,?,?,?)";
		int i= jdbcTemplate.update(sql,std.getId(),std.getName(),std.getAge(),std.getCity());
		System.out.println(i);
	}
	
	
	
	public Student getStudent(int id){
		String sql="select * from student where id=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{id},new StudentMapper());
	}
	
	
	public Student getStudentByAge(int age){
		String sql="select * from student where age=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{age},new StudentMapper());
	}
	
	

	public void updateStudent(int age,int id){
		String sql="update student set age=? where id=?";
		int i=jdbcTemplate.update(sql,age,102);
		System.out.println(i);
	}
	
	
	public void updateStudentName(int name,int id){
		String sql="update student set name=? where id=?";
		int i=jdbcTemplate.update(sql,name,102);
		System.out.println(i);
	}
	
	
	public void deleteStudent(int id){
		String sql="delete from student where id=?";
		int i=jdbcTemplate.update(sql,id);
		System.out.println(i);
	}
	
	public List<Student> listStudent(){
		String sql="select *from student";
		return jdbcTemplate.query(sql, new StudentMapper());
	}
	
	
}
