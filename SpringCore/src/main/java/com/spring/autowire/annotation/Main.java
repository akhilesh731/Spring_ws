package com.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/annotation/AutoConfig.xml");
		Employee employee = (Employee)context.getBean("emp1");
		System.out.println(employee);
		((ClassPathXmlApplicationContext)context).close();
	}
}
