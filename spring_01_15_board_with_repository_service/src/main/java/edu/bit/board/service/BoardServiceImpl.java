package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.dao.BoardDAO;
import edu.bit.board.vo.BoardVO;

//�ٸ� �����ڵ鿡�� �� ��ü�� �������� �˸���, �� ������� �ʰ� ��ü�� ������Ų��.
@Service("boardService")
public class BoardServiceImpl implements BoardService{

	// BoardDAO boardDAO = new BoardDAO(); // ��ü�� �ش� Ŭ�������� �����ȴ�.
	// @Autowired : Ÿ���� �ؼ��ؼ� ��ü�� �ڵ����� ���Խ��� �ִ� ��, ��ü�� IoC�����̳ʿ��� ����	
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList(){
		
		return boardDAO.getBoardList();
	}
	
	@Override
	public int boardWrite(String bName, String bTitle, String bContent){
		
		return boardDAO.write(bName, bTitle, bContent);
	}
	
	@Override
	public BoardVO contentView(String strID) {
		
		return boardDAO.contentView(strID);
	}
	
	@Override
	public int modify(String bId, String bName, String bTitle, String bContent) {
		
		return boardDAO.modify(bId, bName, bTitle, bContent);
	}

}
