package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/stereotype/StereoConfig.xml");
		Student student = (Student)context.getBean("stud1");
		//Student student = (Student)context.getBean("student");
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		System.out.println(student.hashCode());
		
		Student student1 = (Student)context.getBean("stud1");
		System.out.println(student1.hashCode());
		((ClassPathXmlApplicationContext)context).close();
	}
}
