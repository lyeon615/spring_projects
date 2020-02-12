package edu.bit.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import edu.bit.board.vo.BoardVO;

@Service
public interface BoardService {
	
	public List<BoardVO> selectBoardList();
	
	public int insertBoard(@Param("bName") String bName, 
			@Param("bTitle") String bTitle, @Param("bContent") String bContent);
	
	
	@Select("select * from mvc_board where bId = #{bId}")
	public BoardVO selectBoardContent(@Param("bId") String strbId);
	
	
	public int updateBoardContent(@Param("bId") String bId, @Param("bName") String bName,
			@Param("bTitle")String bTitle, @Param("bContent")String bContent);
	
	
	@Delete("delete from mvc_board where bId = #{bId}")
	public void deleteBoard(@Param("bId") String strbId);
	
	@Select("select * from mvc_board where bId = #{bId}")
	public BoardVO selectBoardReply(@Param("bId")String strbId);
	
//	public void insertBoardReply(@Param("bId")String bId, @Param("bName")String bName, 
//			@Param("bTitle")String bTitle, @Param("bContent")String bContent,  
//			@Param("bGroup")String bGroup, @Param("bStep")String bStep, @Param("bIndent")String bIndent);
	
	//위의 3줄과 같은 개념
	public void insertVOBoardReply(@Param("boardVO") BoardVO boardVO);
	

	public void updateBoardReplyShape(@Param("bGroup")String strGroup, @Param("bStep")String strStep);
	
	
	@Update("update mvc_board set bHit = bHit + 1 where bId = #{bId}")
	public void updateBoardUpHit(@Param("bId")String bId);
	
}
