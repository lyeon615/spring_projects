package edu.bit.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.emp.mapper.EmpMapper;
import edu.bit.emp.vo.EmpVO;

@Service
public class EmpService {
	
	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmpList() {
		
		return empMapper.selectEmpList();
	}

	public EmpVO selectEmpOne(String empNo) {
		return empMapper.selectEmpOne(empNo);
	}
}
