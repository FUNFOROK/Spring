package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.psl.beans.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public void saveEmployee(Employee e) {
		String sql="insert into employee values("+e.getId()+",'"+e.getName()+"','"+e.getEmail()+"');";
		System.out.println(sql);
		if(template==null)
		{
			System.out.println("true");
		}	
		else
			template.update(sql);
	}

	@Override
	public Employee getEmployee(int id) {
		return template.queryForObject("select * from employee where id="+id, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rownum)
					throws SQLException {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				return e;
			}
			
		});
	}

	@Override
	public void updateEmployee(int id, String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}


}
