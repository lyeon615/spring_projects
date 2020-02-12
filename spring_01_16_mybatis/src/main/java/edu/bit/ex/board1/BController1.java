package edu.bit.ex.board1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 첫 번째 방법
// 1. 인터페이스 IBDao를 XML namespace에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao">
// 2. sqlSession.getMapper(IBDao.class)를 이용.
// but 요즘은 잘 사용 안 함. 옛날 소스에 남아 있는 경우가 있음

@Controller
public class BController1 {

	@Autowired
	BService1 bservice;
	
	@RequestMapping("/list1")
	public String list1(Model model) throws Exception {
		System.out.println("list1()");
		
		model.addAttribute("list", bservice.selectBoardList());
		return "list";
				
	}
	
}
