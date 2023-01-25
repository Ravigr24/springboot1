package com.project.springboot.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.project.springboot.exception.ResourceNotFoundException;
import com.project.springboot.model.Employee;
import com.project.springboot.repository.EmployeeRepository;
import com.project.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
	
//		Optional<Employee>  employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		// by useing lamda function
		return employeeRepository.findById(id).orElseThrow(() ->
					new ResourceNotFoundException("Employee", "Id", id));
		
		
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// TODO Auto-generated method stub
		//to check wether the employee with given id is existing or not 
		Employee existingEmployee =employeeRepository.findById(id).orElseThrow(() ->
					 new ResourceNotFoundException("Employee", "Id", id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		//save existing employee to DB
		employeeRepository.save(existingEmployee);
		
		
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		//to check if employee is exixt in data base or not
		employeeRepository.findById(id).orElseThrow(() ->
					new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
		
	}

}
