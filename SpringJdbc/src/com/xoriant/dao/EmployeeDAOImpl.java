package com.xoriant.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xoriant.dto.Employee;

@Component("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void addEmployee(Employee employee) {
		String query = "insert into employee values(?, ?, ?)";
		jdbcTemplate.update(query, employee.getEmpId(), employee.getName(), employee.getSalary());
		System.out.println("Record inserted");
	}

	@Override
	public void updateEmployee(int empId, double salary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select * from employee where id=?";
		Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{empId}, new EmployeeMapper());
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper());
		return employees;
	}
}
