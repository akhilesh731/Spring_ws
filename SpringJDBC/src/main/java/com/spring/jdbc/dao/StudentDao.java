package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {
	public int insertStudent(Student student);

	public int updateStudent(Student student);
	
	public int deleteStudent(int studentId);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
}
