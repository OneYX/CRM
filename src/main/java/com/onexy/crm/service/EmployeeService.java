package com.onexy.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.onexy.crm.dao.EmployeeMapper;
import com.onexy.crm.entity.Employee;

@Service
public class EmployeeService {
	private EmployeeMapper employeeMapper;
	
	@Autowired
	public void setEmployeeMapper(EmployeeMapper employeeMapper) {
		this.employeeMapper = employeeMapper;
	}
	
	public List<Employee> getEmployees(int pageNum, int pageSize) {
		Page page = PageHelper.startPage(pageNum, pageSize,true);
		return employeeMapper.selectAll();
	}
	
	public void save(Employee employee){
		try {
			employeeMapper.insert(employee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("新增失败");
		}
	}

	public void update(Employee employee) {
		try {
			employeeMapper.updateByPrimaryKey(employee);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("修改失败");
		}
	}
}
