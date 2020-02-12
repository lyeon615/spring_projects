package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper4 {

	public List<BoardVO> selectBoardList();
	

	// 위와 같은 함수인데 3번 형식
	// ++ 4번은 3번 방식하고 혼용이 가능하다. 반대는 안 됨!
	
	@Select("select bId from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList1();
}
