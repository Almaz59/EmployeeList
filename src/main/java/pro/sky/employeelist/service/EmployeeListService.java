package pro.sky.employeelist.service;


import pro.sky.employeelist.data.Employee;

import java.util.List;

public interface EmployeeListService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    List<Employee> showListOfEmployee();
}

