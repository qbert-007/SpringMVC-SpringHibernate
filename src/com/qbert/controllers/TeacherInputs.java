package com.qbert.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherInputs {
	
	@RequestMapping("/teacherReg")
	public void teacherInfo(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("tName");
		String sub=req.getParameter("tSubject");
		double sal=Double.parseDouble(req.getParameter("tSalary"));
		
		System.out.println("name is ="+name);
		
		req.setAttribute("name", name);
		req.setAttribute("sub", sub);
		req.setAttribute("sal", sal);
		RequestDispatcher dispatch=req.getRequestDispatcher("insert");
		dispatch.forward(req, res);
	}
}
