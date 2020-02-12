package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 두 번째 방법
// 1. 인터페이스 필요 없다. sqlSession에서 제공하는 함수 (selectList, selectOne...등)를 이용
// 2. 쿼리구현을 위한 xml이 필요한데, 해당 xml의 namespace 개발자가 정한다.
// 이것도 요즘에는 잘 안쓰지만 그래도 옛날 코드에 많이 보임

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
