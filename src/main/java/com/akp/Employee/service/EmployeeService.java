package com.akp.Employee.service;import com.akp.Employee.entity.Employee;import com.akp.Employee.model.EmployeeDTO;import java.util.List;public interface EmployeeService {    Employee saveEmployee(Employee employee);    List<Employee> getAllEmployee();    Employee getEmployee(int id);    Employee updateEmployee(Employee employee, int id);    Long deleteEmployee(int id);}