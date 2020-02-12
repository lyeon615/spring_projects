package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 세 번째 방법
// 1. 인터페이스 위에 어노테이션을 붙이는 형식 , src/main/resources/sqlmap에 xml이 필요 없음
// 2. root-context.xml에 코드 추가      <mybatis-spring:scan base-package="edu.bit.ex.*"/>
// but, 쿼리가 길어지면 사용하기 힘들다는 단점이 있다.

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
