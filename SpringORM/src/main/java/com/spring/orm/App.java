package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/resources/SpringConfig.xml");
        StudentDao studentDao = (StudentDao)context.getBean("studentDao");
        System.out.println(studentDao);
          
//        int i = studentDao.insertStudent(new Student(100, "Ram", "Delhi"));
//        System.out.println(i);
        
//        Student student = studentDao.getStudent(220);
//        System.out.println(student);
          
          List<Student> list = studentDao.getAllStudents();
          for(Student stud: list) {
        	  System.out.println(stud);
          }
          
//          studentDao.deleteStudent(220);
          
//          Student student = studentDao.getStudent(100);
//          student.setName("Radha");
//          studentDao.updateStudent(student);
          
        ((ClassPathXmlApplicationContext)context).close();
    }
}
