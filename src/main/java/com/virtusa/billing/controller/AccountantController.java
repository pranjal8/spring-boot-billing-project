package com.virtusa.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.billing.dao.AccountantRepository;
import com.virtusa.billing.dao.StudentsRepository;
import com.virtusa.billing.model.Accountant;
import com.virtusa.billing.model.Students;

@Controller
public class AccountantController
{
	
	@Autowired
	AccountantRepository accountantRepo;
	
	@Autowired
	StudentsRepository studentsRepo;
	
	@RequestMapping("accountantLogin")
	public String accountantLogin() {
		System.out.println("accountantLogin1");
		return "accountantLogin";
	}
	@RequestMapping("AccountantLoginController")
	public ModelAndView AccountantLoginControlle(@RequestParam("branch")String branch, @RequestParam("uname")String username, @RequestParam("pwd")String password)
	{
		System.out.println("AccountantLoginController");
		Accountant accountant=accountantRepo.findByBranch(branch);
		if(accountant==null) {
			ModelAndView mv=new ModelAndView("accountantLogin");
			return mv;
		}
		
		if(username.equals(accountant.getUsername()) && password.equals(accountant.getPassword()) ) {
			System.out.println("Login Success");
			ModelAndView mv=new ModelAndView("accountantHome");
			mv.addObject(accountant);
			return mv;
		}
		else {
			System.out.println("Login failed");
			ModelAndView mv=new ModelAndView("accountantLogin");
			return mv;
		}
	}
	
	@RequestMapping("addStudents")
	public String addStudents() {
		
		return "addStudents";
	}
	@RequestMapping("AddStudentController")
	public String addStudentController(Students students) {
		System.out.println(students);
		studentsRepo.save(students);
		return "accountantHome";
	}
}
