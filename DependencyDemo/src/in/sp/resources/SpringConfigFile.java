package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddress() {
		Address address = new Address(217, "Noida", 201310);
		return address;
	}
	
	@Bean("student1")
	public Student createStudent() {
		Student student = new Student();
		student.setId(110);
		student.setName("Ram");
		student.setAddress(createAddress());
		return student;
	}
}
