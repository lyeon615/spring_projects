package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper {

	// �������̽� �Լ� ���� ������̼�  // �������̽��� ���� �ڼ��� �����ؾ� ��. 
	// �ٸ� Ŭ���� ��𿡼��� �����ϴ� �ڵ尡 ���µ�, ���̹�Ƽ���� ���������� �����ϰ� �ֱ� �����̴�.
	// BoardVO�� �����Լ��� ȣ���ؼ� �÷���� �̸��� ���� ������ �����͸� ����
	// ���� �ٸ� ��� ������ ������� �Ѵ�.
	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent "
			+ " from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList();

}
