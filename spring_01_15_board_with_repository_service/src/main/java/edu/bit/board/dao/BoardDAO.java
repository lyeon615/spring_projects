package edu.bit.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import edu.bit.board.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	
	DataSource ds;
	
	public BoardDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> dtos = new ArrayList<BoardVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ds.getConnection();
			
			String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent"
									+ " from mvc_board order by bGroup desc, bstep asc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
				BoardVO dto = new BoardVO(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				dtos.add(dto);				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		return dtos;		
	}	
	
	public int write(String bName, String bTitle, String bContent){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int rn = 0; 
		
		try {
			conn = ds.getConnection();
			
			String query = "insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent)"
					+ " values (mvc_board_seq.nextval, ?, ?, ?, 0, mvc_board_seq.currval, 0, 0 )";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			
			rn = pstmt.executeUpdate();
							
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		return rn;
	}
	
	public BoardVO contentView(String strID) {
		
		BoardVO dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = ds.getConnection();
			
			String query = "select * from mvc_board where bId = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup = rs.getInt("bGroup");
				int bStep = rs.getInt("bStep");
				int bIndent = rs.getInt("bIndent");
				
				dto = new BoardVO(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
	public int modify(String bId, String bName, String bTitle, String bContent) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int rn = 0;
		
		try {
			conn = ds.getConnection();
			
			String query = "update mvc_board set bName = ?, bTitle = ?, bContent = ? where bId = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			pstmt.setInt(4, Integer.parseInt(bId));
			rn = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return rn;
	}
	
}
