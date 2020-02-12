package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 네 번째 방법
// 1. 1번 방식과 같은 방식, 대신 sqlSession.getMapper 함수 사용 안함  // 간단하고 심플함 
// 2. root-context.xml에 코드 추가      <mybatis-spring:scan base-package="edu.bit.ex.*"/>
// + 요즘 실무에서는 이렇게 사용한다.
// ++ 4번은 3번 방식하고 혼용이 가능하다. 반대는 안 됨!
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
