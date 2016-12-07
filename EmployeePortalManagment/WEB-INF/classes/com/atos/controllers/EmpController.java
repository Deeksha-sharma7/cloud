package com.atos.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atos.pojo.Employee;
import com.atos.services.EmpService;

@Controller
@RequestMapping("/atos")
public class EmpController {
@Autowired
private EmpService service;
public EmpController() 
{
	System.out.println("in userController ctor "+getClass().getName());
}
@RequestMapping("/home")
public String showHomeForm(Model model) throws IOException
{
	return "home";
}
@RequestMapping("/login")
public String showLoginForm(Model model)
{
	model.addAttribute("loginmodel",new Employee());
	return "login";
}
@RequestMapping("/hr")
public String showHrForm()
{
	//model.addAttribute("loginmodel",new Employee());
	return "hr";
}
@RequestMapping("/nemp")
public String showEmpForm()
{
	//model.addAttribute("loginmodel",new Employee());
	return "nemp";
}
@RequestMapping("/allemplist")
public ModelAndView allemplist()
{
	List<Employee> list=service.listEmployee();
	return new ModelAndView("allemplist","list",list);
}
@RequestMapping(value="/login",method=RequestMethod.POST)
public String processLoginForm(@ModelAttribute("loginmodel") Employee emp,Model model,BindingResult res,HttpSession hs)
{
	System.out.println(emp.getUname() +" "+emp.getPasswd());
	 Employee sample=service.getValidateUser(emp);
	if(sample==null)
	{
		model.addAttribute("invalid_em", emp);
		return "invalid";
	}
	else
	{
	hs.setAttribute("emp", sample);
	if(sample.getRole().equalsIgnoreCase("admin"))
		return "redirect:/atos/hr";
	else
		return "nemp";
	}
}
@RequestMapping("/register")
public String showRegistrationForm(Model model)
{
	model.addAttribute("registerModel",new Employee());
	return "register";
}
@RequestMapping(value="/register",method=RequestMethod.POST)
public String processRegistrationForm( @ModelAttribute("registerModel") Employee emp,BindingResult res,Model model)
{
	
	System.out.println("=================="+emp.toString());
	//emp.setRole("emp");
	@SuppressWarnings("unused")
	boolean stat=service.getRegisterCustomer(emp);
	return "home";
}
@RequestMapping(value = "/logout")
public String logout(HttpSession hs, Model map, HttpServletRequest rq, HttpServletResponse rs) 
{
	
	System.out.println("in logout");
	map.addAttribute("valid_user", hs.getAttribute("emp"));
	hs.invalidate();
	String path = rq.getContextPath();
	rs.setHeader("refresh", "3;" + path);
	return "logout";
}
/*
@RequestMapping(value="/deleteemp/{eid}",method = RequestMethod.GET)  
public ModelAndView delete(@PathVariable int eid){  
	Employee emp=service.getEmployeeById(eid);
	service.deleteEmployee(emp);  
    return new ModelAndView("redirect:/viewemp");  
} 
*/
@RequestMapping("deleteEmployee")
public ModelAndView deleteEmployee(@RequestParam String dasID) {
   // logger.info("Deleting the Employee. Id : "+id);
    service.deleteEmployee(dasID);
    return new ModelAndView("redirect:nemp");
}
}
