package edu.bit.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@Controller
public class BoardController {

	@Inject
	BoardService boardService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", boardService.selectBoardList());
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
	
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(BoardVO boardVO) {	
		
		boardService.insertBoardWrite(boardVO);
		
		return "redirect:list";
	}
	
}
