package com.zhss.oa.auth.organ.mapper;

import com.zhss.oa.auth.organ.model.Employee;

public interface EmployeeMapper {

    public void addEmployee(Employee employee);

    public Employee findEmployeeId(Long id);

}

