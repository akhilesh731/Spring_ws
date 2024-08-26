package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

//the class is Spring configuration class
//it allows us to define beans and their dependencies in a java-based way
@Configuration
public class SpringConfigFile {
	@Bean("student1")
    public Student helloStudent() {
		Student std = new Student();
		std.setName("Kamal");
		std.setRollno(103);
		std.setEmail("kamal@gmail.com");
		return std;
    }
	
	@Bean("student2")
    public Student hiStudent() {
		Student std = new Student();
		std.setName("Raj");
		std.setRollno(105);
		std.setEmail("raj@gmail.com");
		return std;
    }
}
