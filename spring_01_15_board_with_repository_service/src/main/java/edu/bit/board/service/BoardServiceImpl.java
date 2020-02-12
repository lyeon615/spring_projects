package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.dao.BoardDAO;
import edu.bit.board.vo.BoardVO;

//다른 개발자들에게 이 객체가 서비스임을 알리고, 빈에 등록하지 않고도 객체를 생성시킨다.
@Service("boardService")
public class BoardServiceImpl implements BoardService{

	// BoardDAO boardDAO = new BoardDAO(); // 객체는 해당 클래스에서 관리된다.
	// @Autowired : 타입을 해석해서 객체를 자동으로 주입시켜 주는 것, 객체를 IoC컨테이너에서 관리	
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList(){
		
		return boardDAO.getBoardList();
	}
	
	@Override
	public int boardWrite(String bName, String bTitle, String bContent){
		
		return boardDAO.write(bName, bTitle, bContent);
	}
	
	@Override
	public BoardVO contentView(String strID) {
		
		return boardDAO.contentView(strID);
	}
	
	@Override
	public int modify(String bId, String bName, String bTitle, String bContent) {
		
		return boardDAO.modify(bId, bName, bTitle, bContent);
	}

}
