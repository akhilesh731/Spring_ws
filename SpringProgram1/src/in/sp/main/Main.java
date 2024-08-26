package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("in/sp/resources/SpringConfig.xml");
        Student std = (Student)context.getBean("stdId");
        System.out.println(std);
        
        ((ClassPathXmlApplicationContext)context).close();
	}

}
