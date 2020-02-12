package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService1 {

	// IoC�����̳�(root-context.xml)�� �����Ǿ� �ִ� ��ü�� �ּҸ� �����´�.
	// ��ü ������ �ƴ϶� ��ü ����, new �ʹ� �ٸ���. 
	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception {
		
		// board1.xml�� ����
		IBDao dao = sqlSession.getMapper(IBDao.class);
		
		return dao.listDao();
	}
}
