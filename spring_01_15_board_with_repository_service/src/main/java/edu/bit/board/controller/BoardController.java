package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list() run");
		List<BoardVO> list = boardService.getBoardList();
		
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		System.out.println("write_view() run");
		
		return "write_view";
	}
	
	
	/*  // HttpServletRequest 객체 이용
	@RequestMapping("/write")
	public String write(HttpServletRequest req) {
		System.out.println("write() run");
		String bName = req.getParameter("bName");
		String bTitle = req.getParameter("bTitle");
		String bContent = req.getParameter("bContent");
		
		boardService.getBoardWrite(bName, bTitle, bContent);
		
		return "redirect:list";
	} */
	
	// 커맨드 객체 이용
	@RequestMapping("/write")
	public String write(BoardVO boardVO) {
		System.out.println("write() run");
		
		int rn = boardService.boardWrite(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());

		if(rn == 1) {
			System.out.println("성공");
		}else
			System.out.println("실패");

		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		System.out.println("content_view() run");
		
		int id = boardVO.getbId();
		
		BoardVO content = boardService.contentView(Integer.toString(id));

		model.addAttribute("content_view", content);
		
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(BoardVO boardVO, Model model) {
		System.out.println("modify() run");
		
		int rn = boardService.modify(Integer.toString(boardVO.getbId()), boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());

		if(rn == 1) {
			System.out.println("성공");
		}else
			System.out.println("실패");
		
		return "redirect:list";
	}	
}
