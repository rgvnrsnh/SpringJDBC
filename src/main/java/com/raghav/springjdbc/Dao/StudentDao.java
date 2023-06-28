package com.raghav.springjdbc.Dao;

import java.util.List;

import com.raghav.springjdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int changeData(Student student);
	public int deleteDataById(int id);
	public Student getUserById(int id);
	public List<Student> getAllStudent();

}
