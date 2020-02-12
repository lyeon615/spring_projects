package edu.bit.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.board.page.Criteria;
import edu.bit.board.page.PageMaker;
import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@RestController
@RequestMapping("/rest/*")
public class BoardRestController {
	
	@Inject
	BoardService boardService;

	@RequestMapping("/list2")
	public List<BoardVO> list2(Criteria criteria, Model model) {
		System.out.println("list2()");
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(criteria);
		
		int totalCount = boardService.selectCountBoard();
		pageMaker.setTotalCount(totalCount);
		
		//List<BoardVO> boardList = boardService.selectBoardListPage(criteria);
		
		//model.addAttribute("list", boardList);
		model.addAttribute("pageMaker", pageMaker);

		return boardService.selectBoardListPage(criteria);
	}
}
