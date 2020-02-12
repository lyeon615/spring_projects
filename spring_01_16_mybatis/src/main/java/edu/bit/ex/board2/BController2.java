package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// �� ��° ���
// 1. �������̽� �ʿ� ����. sqlSession���� �����ϴ� �Լ� (selectList, selectOne...��)�� �̿�
// 2. ���������� ���� xml�� �ʿ��ѵ�, �ش� xml�� namespace �����ڰ� ���Ѵ�.
// �̰͵� ���򿡴� �� �Ⱦ����� �׷��� ���� �ڵ忡 ���� ����

@Controller
public class BController2 {

	@Autowired
	BService2 bservice;
	
	@RequestMapping("/list2")
	public String list1(Model model) throws Exception {
		System.out.println("list2()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
				
	}
	
}
