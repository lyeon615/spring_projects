package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface BoardMapper {

	// 인터페이스 함수 위에 어노테이션  // 인터페이스는 원래 자손이 구현해야 함. 
	// 다른 클래스 어디에서도 구현하는 코드가 없는데, 마이바티스가 내부적으로 구현하고 있기 때문이다.
	// BoardVO의 세터함수를 호출해서 컬럼명과 이름이 같은 변수명에 데이터를 전달
	// 만약 다를 경우 매핑을 시켜줘야 한다.
	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent "
			+ " from mvc_board order by bGroup desc, bStep asc")	
	public List<BoardVO> selectBoardList();

}
