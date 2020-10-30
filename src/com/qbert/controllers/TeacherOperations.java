package com.qbert.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qbert.Teacher;

@Controller
public class TeacherOperations {
	private static TeacherDao getDao() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherDao dao=(TeacherDao) context.getBean("myDao");
		return dao;
	}
	
	
	@RequestMapping("/insert")
	public ModelAndView sendToDb(HttpServletRequest req) {
		int i=0;
		ModelAndView mv=new ModelAndView();
	TeacherDao dao=TeacherOperations.getDao();
	Teacher t=new Teacher();
	double sal=(double)req.getAttribute("sal");
	System.out.println("salary is :"+sal);
	t.setT_name((String) req.getAttribute("name"));
	t.setSubject((String) req.getAttribute("sub"));
	t.setSalary(sal);
	try {
		i=dao.regTeacher(t);
	}catch(DataIntegrityViolationException v) {
		mv.addObject("err","The subject is already registered. Try another");
	}
	
	
	mv.addObject("i", i);
	mv.addObject("salary", sal);
	mv.setViewName("resultTeacher");
	return mv;
	}
}
