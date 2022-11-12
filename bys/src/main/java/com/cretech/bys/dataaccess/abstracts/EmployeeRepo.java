package com.cretech.bys.dataaccess.abstracts;

import java.util.List;

import com.cretech.bys.entities.concretes.Employee;

public interface EmployeeRepo {

	List<Employee> getAll();
}
