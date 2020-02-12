package edu.bit.emp.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.emp.service.EmpService;

@Controller
public class EmpController {
	
	@Inject
	EmpService empService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		model.addAttribute("list", empService.selectEmpList());
		return "list";
	}
	
	@RequestMapping("/list2")
	public String list2(Model model) {
		System.out.println("list()");
		
		model.addAttribute("list", empService.selectEmpList());
		return "list2";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest req, Model model) {
		System.out.println("content_view()");
		
		String empno = req.getParameter("empNo");
		model.addAttribute("content_view", empService.selectEmpOne(empno));		
		return "content_view";
	}
	
}
