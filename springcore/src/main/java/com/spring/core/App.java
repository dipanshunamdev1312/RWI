package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("hello.....");
       ApplicationContext context = new ClassPathXmlApplicationContext("spconfig.xml");
       
       Student student1 = (Student) context.getBean("Student1");
       Student student2 = (Student) context.getBean("Student2");
       Student student3 = (Student) context.getBean("Student3");

       
       System.out.println(student1);
       System.out.println(student2);
       System.out.println(student3);

       
       
    }
}
