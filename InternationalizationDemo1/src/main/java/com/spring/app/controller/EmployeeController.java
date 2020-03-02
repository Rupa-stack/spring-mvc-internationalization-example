package com.spring.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.bean.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/index")
	public ModelAndView add(){
		
		System.out.println("add() method..");
		
		Employee employee= new Employee();
		return new ModelAndView("addemployee","employee",employee);
		
		
		
	}
}

