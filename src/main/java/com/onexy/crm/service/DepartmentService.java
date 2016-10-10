package com.onexy.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onexy.crm.dao.DepartmentMapper;
import com.onexy.crm.entity.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	public List<Department> getDepartments(){
		return departmentMapper.selectAll();
	}
	
}
