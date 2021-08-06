package com.example.ctrl;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmpProfService;
import com.example.vo.Employee;

import ch.qos.logback.classic.Logger;

@RestController
public class RestEmpProfCtrl {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(RestEmpProfCtrl.class);

	@Autowired
	EmpProfService empService;

	@PostMapping("/add")
	public void addEmpPrpf(@RequestBody Employee e) {
		logger.info("Add Employee start");
		empService.add(e);
		logger.info("End Employee start");
	}

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() {
		logger.info("getAllEmp Employee start");
		logger.info("getAllEmp Employee end");
		return empService.findAll();
	}

	@GetMapping("/getAllEmp")
	public Employee getById(int id) {
		logger.info("getById Employee start");
		logger.info("getById Employee end");
		return empService.findById(id);
	}
}
