package com.example.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.EmpProfRepository;
import com.example.service.EmpProfService;
import com.example.vo.Employee;

@Service
public class EmpProfServiceImpl implements EmpProfService {

	Logger log=LoggerFactory.getLogger(EmpProfServiceImpl.class);
	
	@Autowired
	EmpProfRepository empRepo;
	
	@Override
	public void add(Employee e) {
		log.info("add Employee start");
			empRepo.save(e);
		log.info("add Employee end");
	}

	@Override
	public List<Employee> findAll() {
		log.info("findAll Employee start");
		log.info("findAll Employee end");
		return empRepo.findAll();
	}

	@Override
	public Employee findById(int id) {
		log.info("findById Employee start");
		log.info("findById Employee end");
		return empRepo.findById(id).get();
	}

}
