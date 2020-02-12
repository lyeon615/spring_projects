package edu.bit.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.bit.emp.vo.EmpVO;

public interface EmpMapper {

	@Select("select * from emp order by empno")
	public List<EmpVO> selectEmpList();

	@Select("select * from emp where empNo = #{empNo}")
	public EmpVO selectEmpOne(String empno);
}
