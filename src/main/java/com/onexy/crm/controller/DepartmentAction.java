package com.onexy.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onexy.crm.entity.Department;
import com.onexy.crm.service.DepartmentService;

@Controller
@RequestMapping("/dept")
public class DepartmentAction {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Department> lsit() {
		return departmentService.getDepartments();
	}
	
}
