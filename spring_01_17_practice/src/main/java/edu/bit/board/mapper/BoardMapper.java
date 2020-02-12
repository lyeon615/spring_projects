package edu.bit.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.bit.board.vo.BoardVO;

public interface BoardMapper {
	
	@Select("SELECT * FROM mvc_board ORDER BY bGroup DESC bStep ASC")
	public List<BoardVO> selectBoardList();
	
	public void insertBoardWrite(BoardVO boardVO);
	
	
}
