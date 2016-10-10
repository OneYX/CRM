package com.onexy.crm.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Integer age;

    private Long departmentId;
    
    public Employee() {
	}

	public Employee(Long id, String name, String password, String email,
			Integer age, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.departmentId = departmentId;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }
    
    public String getDeptName(){
    	return department.getName();
    }
    
    public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
    
    @JSONField(name="deptId")
    public Long getDepartmentId() {
		return departmentId;
	}
    
    private Department department;
    @JSONField(serialize=false)
    public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password="
				+ password + ", email=" + email + ", age=" + age
				+ ", departmentId=" + departmentId + "]";
	}

}