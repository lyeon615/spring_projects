package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService2 {

	// IoC�����̳�(root-context.xml)�� �����Ǿ� �ִ� ��ü�� �ּҸ� �����´�.
	// ��ü ������ �ƴ϶� ��ü ����, new �ʹ� �ٸ���. 
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		// board2.xml �� ���� , selectList("namespace.select id")
		return sqlSession.selectList("board.selectBoardList"); 
	}
}
