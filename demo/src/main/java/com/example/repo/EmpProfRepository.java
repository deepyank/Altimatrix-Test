package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.vo.Employee;

@Repository
public interface EmpProfRepository extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee>{
	
	public Employee getEmpProfId(int id);

}
