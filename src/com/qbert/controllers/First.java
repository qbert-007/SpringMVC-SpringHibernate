package com.qbert.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class First {
	@RequestMapping("/teach")
	public String teacherForm() {
		return "teacherPage";
	}
	@RequestMapping("/study")
	public String studentForm() {
		return "studentPage";
	}
}
