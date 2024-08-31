package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

public class StudentDaoImpl implements StudentDao{
	private HibernateTemplate hibernateTemplate;
	
	public StudentDaoImpl() {}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int insertStudent(Student student) {
		int save = (Integer)this.hibernateTemplate.save(student);
		return save;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
