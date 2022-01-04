package com.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.billing.dao.AccountantRepository;
import com.billing.dao.AdminRepository;
import com.billing.dao.StudentsRepository;
import com.billing.model.Accountant;
import com.billing.model.Admin;
import com.billing.model.Students;

@Controller
public class AdminController
{
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	AccountantRepository accountantRepo;
	
	@Autowired
	StudentsRepository studentsRepo;
	
	@RequestMapping("/")
	public String adminLogin() {
		System.out.println("Admin Home");
		
		return "adminLogin";
	}
	
	@RequestMapping("adminLoginCheck")
	public ModelAndView adminLoginCheck(Admin admin) {
		System.out.println("adminLoginCheck...");
		System.out.println("Admin entered : "+admin);
		
		Admin dbAdmin=adminRepo.findById(admin.getRoleName()).orElse(new Admin());
		System.out.println("Admin data from DB :"+dbAdmin);
		
		if(admin.getPassword().equals(dbAdmin.getPassword())) {
			System.out.println("Login Success");
			
			ModelAndView mv=new ModelAndView("adminHome");
			mv.addObject(admin);
			
			return mv;
			
		}
		else {
			System.out.println("Login Failed");
			ModelAndView mv=new ModelAndView("adminLogin");
			return mv;
		}
	}
	
	@RequestMapping("addAccountant")
	public String addAccountant() {
		System.out.println("Add Accountant");
		return "addAccountant";
	}
	@RequestMapping("viewAccountant")
	public ModelAndView viewAccountant() {
		System.out.println("viewAccountant");
		List<Accountant>list=(List<Accountant>) accountantRepo.findAll();
		System.out.println(list);
		ModelAndView mv=new ModelAndView("viewAccountant");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping("editAccountant")
	public ModelAndView editAccountant() {
		System.out.println("editAccountant");
		List<Accountant>list=(List<Accountant>) accountantRepo.findAll();
		System.out.println(list);
		ModelAndView mv=new ModelAndView("editAccountant");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping("editAcc")
	public ModelAndView editAcc1(@RequestParam("id")int aid) {
		
		ModelAndView mv=new ModelAndView("editAcc1");
		Accountant acc=accountantRepo.findById(aid).orElse(new Accountant());
		System.out.println("ID : "+aid);
		System.out.println("acc : "+acc);
		mv.addObject("ID", aid);
		mv.addObject("acc", acc);
		return mv;
	}
	@RequestMapping("UpdateAccountantController")
	public ModelAndView updateAccountantController(Accountant accountant) {
		
		ModelAndView mv=new ModelAndView("adminHome");
		System.out.println(accountant);
		accountantRepo.deleteById(accountant.getId());
		accountantRepo.save(accountant);
		return mv;
	}
	
	@RequestMapping("deleteAccountant")
	public ModelAndView deleteAccountant() {
		System.out.println("deleteAccountant");
		List<Accountant>list=(List<Accountant>) accountantRepo.findAll();
		System.out.println(list);
		ModelAndView mv=new ModelAndView("deleteAccountant");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping("deleteAcc")
	public ModelAndView deleteAcc(@RequestParam("id")int aid) {
		System.out.println("deleteAcc");
		accountantRepo.deleteById(aid);
		System.out.println("Deleted");
		ModelAndView mv=new ModelAndView("adminHome");
		return mv;
	}
	
	@RequestMapping("viewStudents")
	public ModelAndView viewStudents() {
		System.out.println("viewStudents");
		List<Students>list=(List<Students>) studentsRepo.findAll();
		System.out.println(list);
		ModelAndView mv=new ModelAndView("viewStudents");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping("editStudents")
	public ModelAndView editStudents() {
		System.out.println("editStudents");
		List<Students>list=(List<Students>) studentsRepo.findAll();
		System.out.println(list);
		ModelAndView mv=new ModelAndView("editStudents");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping("editStu")
	public ModelAndView editStu(@RequestParam("id")int sid) {
		System.out.println("editStu");
		Students stu=studentsRepo.findById(sid).orElse(new Students());
		System.out.println("ID : "+sid);
		System.out.println("acc : "+stu);
		ModelAndView mv=new ModelAndView("editStu");
		mv.addObject("ID", sid);
		mv.addObject("stu", stu);
		return mv;
	}
	@RequestMapping("UpdateStudentController")
	public ModelAndView updateStudentController(Students students) {
		
		ModelAndView mv=new ModelAndView("adminHome");
		System.out.println(students);
		studentsRepo.deleteById(students.getRoll());
		studentsRepo.save(students);
		System.out.println("Student Updated");
		return mv;
	}
	@RequestMapping("deleteStudents")
	public ModelAndView deleteStudents() {
		System.out.println("deleteStudents");
		List<Students>list=(List<Students>) studentsRepo.findAll();
		System.out.println(list);
		ModelAndView mv=new ModelAndView("deleteStudents");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping("deleteStu")
	public ModelAndView deleteStu(@RequestParam("id")int sid) {
		System.out.println("deleteStu");
		studentsRepo.deleteById(sid);
		System.out.println("Student Deleted");
		ModelAndView mv=new ModelAndView("adminHome");
		return mv;
	}
	@RequestMapping("Logout")
	public String logout() {
		System.out.println("Logout");
		return "adminLogin";
	}
	
	@RequestMapping("AddAccountantController")
	public String addAccountantController(Accountant accountant) {
		System.out.println("AddAccountantController "+accountant);
		accountantRepo.save(accountant);
		return "adminHome";
	}
	@RequestMapping("adHome")
	public String adHome() {
		return "adminHome";
	}
}
