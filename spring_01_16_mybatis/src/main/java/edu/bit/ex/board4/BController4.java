package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// �� ��° ���
// 1. 1�� ��İ� ���� ���, ��� sqlSession.getMapper �Լ� ��� ����  // �����ϰ� ������ 
// 2. root-context.xml�� �ڵ� �߰�      <mybatis-spring:scan base-package="edu.bit.ex.*"/>
// + ���� �ǹ������� �̷��� ����Ѵ�.
// ++ 4���� 3�� ����ϰ� ȥ���� �����ϴ�. �ݴ�� �� ��!
@Controller
public class BController4 {

	@Autowired
	BService4 bservice;
	@RequestMapping("/list4")
	public String list4(Model model) throws Exception {
		System.out.println("list4()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
	}
	
	@RequestMapping("/list4_1")
	public String list4_1(Model model) throws Exception {
		System.out.println("list4_1()");
		
		model.addAttribute("list", bservice.selectBoardList1());
		return "list";
	}	
}
