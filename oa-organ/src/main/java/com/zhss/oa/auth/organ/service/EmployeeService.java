package com.zhss.oa.auth.organ.service;

import com.zhss.oa.auth.organ.model.Employee;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public Employee findEmployeeById(Long id);


}
