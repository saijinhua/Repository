package com.mr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mr.entity.Student;
import com.mr.service.StudentService;

@Controller
@RequestMapping(value="student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("selectByStudentName")
	@ResponseBody
	public  Student selectByStudentName(String name){
		Student student = studentService.selectByStudentName(name);
		return student;
	}
	
}
