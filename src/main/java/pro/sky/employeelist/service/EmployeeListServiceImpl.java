package pro.sky.employeelist.service;

import org.springframework.stereotype.Service;
import pro.sky.employeelist.data.Employee;
import pro.sky.employeelist.exeptions.BadRequestOfEmployeeListExeption;
import pro.sky.employeelist.exeptions.FullListOfEmployeeListExeptoin;
import pro.sky.employeelist.exeptions.NotFoundEmployeeListExeption;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeListServiceImpl implements EmployeeListService {

    private final List<Employee> employees = new ArrayList<>(List.of());
    private static final Integer sizeList = 30;

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (i == sizeList) {
                throw new FullListOfEmployeeListExeptoin();
            } else if (employees.get(i).getFirstNameOfEmployee().equals(firstName) &&
                    employees.get(i).getLastNameOfEmployee().equals(lastName)) {
                throw new BadRequestOfEmployeeListExeption();
            }
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> showListOfEmployee() {
        return employees;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstNameOfEmployee().equals(firstName) &&
                    employees.get(i).getLastNameOfEmployee().equals(lastName)) {
                employees.set(i, null);
                return employee;
            }
        }
        throw new NotFoundEmployeeListExeption();
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstNameOfEmployee().equals(firstName) &&
                    employees.get(i).getLastNameOfEmployee().equals(lastName)) {
                return employee;
            }
        }
        throw new NotFoundEmployeeListExeption();
    }
}






