package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started.....!");

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//        Student student = new Student();
//        student.setId(666);
//        student.setName("John");
//        student.setCity("Chapri Fata");
//        
//        int result = studentDao.insert(student);
//        
//        System.out.println("student added : "+result);
//        
//        Student student = new Student();
//        student.setId(666);
//        student.setName("Bihari Bhaiyya");
//        student.setCity("Chapri");
//        
//        int change = studentDao.change(student);
//        
//        System.out.println("Changing Data : "+ student);
//
//		int delete = studentDao.delete(666);
//
//		System.out.println("Deleting Data : " + delete);

//		Student student = studentDao.getStudent(542);
//		System.out.println(student);
		
		List<Student> students = studentDao.getAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
