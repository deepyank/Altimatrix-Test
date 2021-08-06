package com.example.service;

import java.util.List;

import com.example.vo.Employee;

public interface EmpProfService {
	
	public void add(Employee e);
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
}
