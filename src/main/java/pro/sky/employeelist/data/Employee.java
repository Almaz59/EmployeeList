package pro.sky.employeelist.data;

import java.util.Objects;

public class Employee {
    String firstNameOfEmployee;
    String lastNameOfEmployee;

    public Employee(String firstNameOfEmployee, String lastNameOfEmployee) {
        this.firstNameOfEmployee = firstNameOfEmployee;
        this.lastNameOfEmployee = lastNameOfEmployee;
    }

    public String getFirstNameOfEmployee() {
        return this.firstNameOfEmployee;
    }

    public String getLastNameOfEmployee() {
        return this.lastNameOfEmployee;
    }


    @Override
    public String toString() {
        return "Имя сотрудника: " + firstNameOfEmployee + " |" + " Фамилия сорудника: " + lastNameOfEmployee;
    }

    @Override
    public boolean equals(Object others) {
        if (others == this) {
            return true;
        }
        if (this.getClass() != others.getClass()) {
            return false;
        }
        Employee b = (Employee) others;
        return firstNameOfEmployee.equals(b.firstNameOfEmployee) && lastNameOfEmployee.equals(b.lastNameOfEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameOfEmployee, lastNameOfEmployee);
    }
}


