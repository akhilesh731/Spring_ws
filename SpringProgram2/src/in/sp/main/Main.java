package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        System.out.println(context);
        Student std = (Student)context.getBean("student2");
        System.out.println(std);
        
        ((AnnotationConfigApplicationContext)context).close();
	}

}
