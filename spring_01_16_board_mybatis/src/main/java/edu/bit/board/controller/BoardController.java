package edu.bit.board.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@Controller
public class BoardController{
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/list")  
	public String list(Model model) {
		System.out.println("list()");
		
		List<BoardVO> list = boardService.selectBoardList();
		
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("/write_view")  
	public String write_view() {
		System.out.println("write_view()");
						
		return "write_view";
	}
	
	@RequestMapping("/write") 
	public String write(BoardVO boardVO) {
		System.out.println("write() run");

		boardService.insertBoard(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());
		
		return "redirect:list";
	}
	
	@RequestMapping("/content_view") 
	public String content_view(BoardVO boardVO, Model model) {
		System.out.println("content_view() run");
		
		boardService.updateBoardUpHit(Integer.toString(boardVO.getbId()));

		BoardVO content = boardService.selectBoardContent(Integer.toString(boardVO.getbId()));
		model.addAttribute("content_view", content);

		return "content_view";			
	}
	
	@RequestMapping("/modify")
	public String modify(BoardVO boardVO) {
		System.out.println("modify() run");
		
		boardService.updateBoardContent(Integer.toString(boardVO.getbId()), 
				boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());

		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(BoardVO boardVO) {
		System.out.println("delete() run");
		
		boardService.deleteBoard(Integer.toString(boardVO.getbId()));

		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) {
		System.out.println("reply_view() run");
		
		BoardVO reply = boardService.selectBoardReply(Integer.toString(boardVO.getbId()));
		model.addAttribute("reply_view", reply);
		
		return "reply_view";
	}	
	
	@RequestMapping("/reply")
	public String reply(BoardVO boardVO) {
		System.out.println("reply() run");
		
		boardService.updateBoardReplyShape(Integer.toString(boardVO.getbGroup()), 
											Integer.toString(boardVO.getbStep()));
		
		boardService.insertVOBoardReply(boardVO);

//		boardService.insertBoardReply(Integer.toString(boardVO.getbId()), 
//				boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent(), 
//				Integer.toString(boardVO.getbGroup()), 
//				Integer.toString(boardVO.getbStep()), Integer.toString(boardVO.getbIndent()));
		
		return "redirect:list";
	}	
	
}