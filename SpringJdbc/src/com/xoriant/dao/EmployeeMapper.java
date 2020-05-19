package com.xoriant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xoriant.dto.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setSalary(rs.getDouble(3));
		
		return employee;
	}

}
