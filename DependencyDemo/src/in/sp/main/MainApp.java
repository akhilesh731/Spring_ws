package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class MainApp {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("in/sp/resources/SpringConfig.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student student = (Student)context.getBean("student1");
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
		//((ClassPathXmlApplicationContext)context).close();
	}
}