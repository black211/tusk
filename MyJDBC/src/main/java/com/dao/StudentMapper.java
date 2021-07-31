package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		//Student std=new Student(resultSet.getString(1), resultSet.getInt(2),resultSet.getString(3));
		
		
		Student std=new Student();
		
		
		std.setId(resultSet.getInt(1));
		std.setName(resultSet.getString(2));
		std.setAge(resultSet.getInt(3));
		std.setCity(resultSet.getString(4));
		
		return std;
	}

}
