package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/resources/SpringConfig.xml");
        StudentDao studentDao = (StudentDao)context.getBean("studentDao");
        System.out.println(studentDao);
        
        ((ClassPathXmlApplicationContext)context).close();
    }
}
