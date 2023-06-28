package com.raghav.springjdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.raghav.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate template;
	
	public int insert(Student student) {
		
        String query1 = "insert into student values (?,?,?)";
        int update = template.update(query1,student.getId(), student.getName(), student.getCity());
		
		return update;
	}
	
	public int changeData(Student student) {
        String query1 = "update student set name=?, city=? where id=?";
        int update = template.update(query1,student.getName(), student.getCity(), student.getId());
		
		return update;
	}
	
	public int deleteDataById(int id) {
		String query1 = "delete from student where id=?";
	    int update = template.update(query1,id);
			
		return update;
	}
	
	public Student getUserById(int id) {
		RowMapper<Student> rowMapper = new rowMapperImpl();
		String query1 = "select * from student where id=?";
		Student student = this.template.queryForObject(query1, rowMapper , id);
		return student;
	}

	public List<Student> getAllStudent() {
		String query1 = "select * from student where name=? ";
		List<Student> students = this.template.query(query1, new rowMapperImpl(), "Vaibhav");
		return students;
	}
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}



}
