package com.qbert.controllers;


import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.qbert.Teacher;

@Controller
public class TeacherDao {
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


	@Transactional
	public int regTeacher(Teacher t) throws DataIntegrityViolationException{
		int i=0;
		i=(int) template.save(t);
		return i;
	}
	
	
}
