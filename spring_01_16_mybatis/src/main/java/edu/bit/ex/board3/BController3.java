package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// �� ��° ���
// 1. �������̽� ���� ������̼��� ���̴� ���� , src/main/resources/sqlmap�� xml�� �ʿ� ����
// 2. root-context.xml�� �ڵ� �߰�      <mybatis-spring:scan base-package="edu.bit.ex.*"/>
// but, ������ ������� ����ϱ� ����ٴ� ������ �ִ�.

@Controller
public class BController3 {

	@Autowired
	BService3 bservice;
	
	@RequestMapping("/list3")
	public String list1(Model model) throws Exception {
		System.out.println("list3()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}	
}
