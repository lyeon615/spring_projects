package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class BService3 {
 
	// ���̹�Ƽ���� ���� �� ��ü�� ����� ���� ��
	@Inject
	BoardMapper boardMapper;
	
	public List<BoardVO> selectBoardList() throws Exception {
				
		return boardMapper.selectBoardList();
	}
}
