package com.psl.dao;

import com.psl.beans.Employee;

public interface IEmployeeDao {
	
	public void saveEmployee(Employee e);
	public Employee getEmployee(int id);
	public void updateEmployee(int id,String email);
	public void deleteEmployee(int id);
		
	
	
}
