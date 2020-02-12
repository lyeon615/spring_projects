package edu.bit.board.service;

import java.util.List;

import edu.bit.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getBoardList();
	
	int boardWrite(String bName, String bTitle, String bContent);
	
	BoardVO contentView(String strID);
	
	int modify(String bId, String bName, String bTitle, String bContent);
	
}
