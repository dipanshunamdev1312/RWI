package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}

	@Override
	public int change(Student student) {
		// Updating Data
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	@Override
	public int delete(int studentID) {
		// Deleting data
		String query = "DELETE FROM student WHERE id=?";
		int delete = this.jdbcTemplate.update(query, studentID);
		return delete;
	}

	@Override
	public Student getStudent(int studentId) {
		// Selecting single student data
		String query = "Select * from student where id=?";
		RowMapper<Student> rawMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rawMapper, studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		// Selecting multiple rows
		String query = "SELECT * FROM student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
