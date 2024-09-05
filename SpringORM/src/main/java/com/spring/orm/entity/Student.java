package com.spring.orm.entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "student_details")
public class Student {
	@javax.persistence.Id
	@javax.persistence.Column(name = "s_id")
	private int id;
	@javax.persistence.Column(name = "s_name")
	private String name;
	@javax.persistence.Column(name = "s_city")
	private String city;
	
	public Student() {}
	
	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
