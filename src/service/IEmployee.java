package service;

import entity.Employee;

public interface IEmployee {
    double calculateAverageSalary(Employee... employee);

    Employee[] listEmployeesWithSalaryLowerThanAverage(Employee... employee);

    double calculateTotalSalaryForPartTimeEmployees(Employee... employee);
}

