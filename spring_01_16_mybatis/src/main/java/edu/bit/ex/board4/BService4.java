package edu.bit.ex.board4;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class BService4 {
 
	// 4번에서도 3번과 똑같이 BoardMapper 사용
	@Inject
	BoardMapper4 boardMapper;
	
	public List<BoardVO> selectBoardList() throws Exception {
				
		return boardMapper.selectBoardList();
	}
	
	public List<BoardVO> selectBoardList1() throws Exception {
		
		return boardMapper.selectBoardList1();
	}
	
}
