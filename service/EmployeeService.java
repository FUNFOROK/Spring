package com.psl.service;
import com.psl.beans.Employee;
import com.psl.dao.IEmployeeDao;

public class EmployeeService {
	
	private IEmployeeDao dao;
	
	public void saveEmployee(Employee e)
	{
		dao.saveEmployee(e);
	}
	public Employee getEmployee(int id)
	{
		
		return dao.getEmployee(id);
	}
	public void updateEmployee(int id,String email)
	{
		dao.updateEmployee(id, email);
	}
	public void deleteEmployee(int id){
		dao.deleteEmployee(id);
		
	}
	public IEmployeeDao getDao() {
		return dao;
	}
	public void setDao(IEmployeeDao dao) {
		this.dao = dao;
	}
	
	
}
