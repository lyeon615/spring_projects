package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService3 {
 
	// 마이바티스가 만들어서 빈에 객체를 만들어 놓은 것
	@Inject
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoardList() throws Exception {
				
		return boardMapper.selectBoardList();
	}
}
