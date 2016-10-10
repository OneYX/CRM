package com.onexy.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onexy.crm.entity.Employee;
import com.onexy.crm.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeAction {
	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public Map<String, Object> list(int page, int rows) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Employee> list = employeeService.getEmployees(page, rows);
		map.put("total", list.size());
		map.put("rows", list);
		return map;
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public Map<String, Object> save(Employee employee,Long deptId) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		employee.setDepartmentId(deptId);
		Long id = employee.getId();
		System.err.println(employee);
		try {
			if (id == null) {
				employeeService.save(employee);
			} else {
				employeeService.update(employee);
			}
		} catch (Exception e) {
			map.put("success", false);
			map.put("message", e.getMessage());
		}
		return map;
	}
	
	
}
