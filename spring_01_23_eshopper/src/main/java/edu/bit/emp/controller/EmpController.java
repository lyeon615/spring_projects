package edu.bit.emp.controller;

import javax.inject.Inject;

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
	
}
