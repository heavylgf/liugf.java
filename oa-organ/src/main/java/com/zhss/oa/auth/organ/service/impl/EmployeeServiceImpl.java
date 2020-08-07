package com.zhss.oa.auth.organ.service.impl;

import com.zhss.oa.auth.organ.mapper.EmployeeMapper;
import com.zhss.oa.auth.organ.model.Employee;
import com.zhss.oa.auth.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeMapper.findEmployeeId(id);
    }

}

//
//public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    private EmployeeMapper employeeMapper;
//
//    public void addEmployee(Employee employee) {
//        employeeMapper.addEmployee(employee);
//    }
//
//    public Employee findEmployeeById(Long id) {
//        return employeeMapper.findEmployeeById(id);
//    }
//
//}
