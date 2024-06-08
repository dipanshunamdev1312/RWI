package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

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
		RowMapper<Student> rawMapper = new RawMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rawMapper, studentId);
		return student;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
