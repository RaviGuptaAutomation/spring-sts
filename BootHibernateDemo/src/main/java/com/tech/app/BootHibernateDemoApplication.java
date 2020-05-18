package com.tech.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tech.app.entities.Employee;
import com.tech.app.repository.EmployeeDao;

@SpringBootApplication
public class BootHibernateDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao empDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootHibernateDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Employee employee = getEmployee();
		empDao.createEmployee(employee);
	}
	
	private Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Ravi");
		emp.setDoj(new Date());
		emp.setSalary(1000.00);
		
		return emp;
	}

}
