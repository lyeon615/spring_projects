package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.mapper.BoardMapper;
import edu.bit.board.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoardList(){
		return boardMapper.selectBoardList();
	}
	
	public void insertBoardWrite(BoardVO boardVO) {
		boardMapper.insertBoardWrite(boardVO);
	}
}
