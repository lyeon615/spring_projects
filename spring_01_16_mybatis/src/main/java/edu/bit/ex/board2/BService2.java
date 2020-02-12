package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService2 {

	// IoC컨테이너(root-context.xml)에 생성되어 있는 객체의 주소를 가져온다.
	// 객체 생성이 아니라 객체 주입, new 와는 다르다. 
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		// board2.xml 과 관련 , selectList("namespace.select id")
		return sqlSession.selectList("board.selectBoardList"); 
	}
}
