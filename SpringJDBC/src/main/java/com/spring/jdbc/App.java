package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application started..." );
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/JdbcConfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfigFile.class);
        
        StudentDao studentDao = context.getBean("studentDaoImpl",StudentDao.class);
        //insert student
        /*Student student = new Student();
        student.setId(120);
        student.setName("Mahesh");
        student.setCity("Noida");
        int result = studentDao.insertStudent(student);
        System.out.println(result);*/

        //update student
        /*Student student = new Student();
        student.setId(120);
        student.setName("Mohit");
        student.setCity("Lucknow");
        int result = studentDao.updateStudent(student);
        System.out.println("student updated "+result);*/
        
        //delete student
        /*int result = studentDao.deleteStudent(120);
        System.out.println("student deleted "+result);*/
        
        //select single student by id
        /*Student student = studentDao.getStudent(200);
        System.out.println(student);*/
        
        //select all the students
        List<Student> list = studentDao.getAllStudents();
        for(Student s: list) {
        	System.out.println(s);
        }
        
        //((ClassPathXmlApplicationContext)context).close();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
