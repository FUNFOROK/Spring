package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.beans.Employee;
import com.psl.service.EmployeeService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
		
		Employee e=context.getBean("emp",Employee.class);
		
		EmployeeService s=context.getBean("service",EmployeeService.class);
		
//		s.saveEmployee(e);
		Employee e2=s.getEmployee(1);
		
		System.out.println("Done!");
	
	
	}

}
