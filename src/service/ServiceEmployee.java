package service;

import entity.Employee;
import entity.FullTime;
import entity.PartTime;

public class ServiceEmployee implements IEmployee {

    @Override
    public double calculateAverageSalary(Employee[] employee) {
        double sum = 0;
        for (Employee e : employee) {
            sum += e.calculateSalary();
        }
        return sum / employee.length;
    }


    //    7: Viết phương thức liệt kê danh sách nhân viên toàn thời gian có
//    mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
    @Override
    public Employee[] listEmployeesWithSalaryLowerThanAverage(Employee[] employee) {
        double avg = calculateAverageSalary(employee);
        Employee[] result = new Employee[employee.length];
        int count = 0;
        for (Employee e : employee) {
            if (e instanceof FullTime) {
                if (e.calculateSalary() < avg) {
                    result[count] = e;
                    count++;
                }
            }
        }
        return result;
    }

    //    8: Viết phương thức tính số lương phải trả cho tất cả các nhân viên bán thời gian.
    @Override
    public double calculateTotalSalaryForPartTimeEmployees(Employee[] employee) {
        double sum = 0;
        for (Employee e : employee) {
            if (e instanceof PartTime) {
                sum += e.calculateSalary();
            }
        }
        return sum;
    }
}
