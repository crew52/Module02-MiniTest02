package Main;

import entity.Employee;
import entity.FullTime;
import entity.PartTime;
import service.ServiceEmployee;

public class Main {
    public static void main(String[] args) {
        FullTime ft01 = new FullTime("FT01", "John Doe", 30, "1234567890", "john.doe@email.com", 1000, 500, 100);
        FullTime ft02 = new FullTime("FT02", "Jane Smith", 28, "2345678901", "jane.smith@email.com", 2500, 600, 150);
        FullTime ft03 = new FullTime("FT03", "Alice Johnson", 35, "3456789012", "alice.johnson@email.com", 200, 700, 200);
        FullTime ft04 = new FullTime("FT04", "Bob Brown", 40, "4567890123", "bob.brown@email.com", 900, 250, 250);
        FullTime ft05 = new FullTime("FT05", "Charlie White", 25, "5678901234", "charlie.white@email.com", 7000, 800, 300);

        PartTime pt01 = new PartTime("P001", "Emily Davis", 22, "6789012345", "emily.davis@email.com", 25);
        PartTime pt02 = new PartTime("P002", "David Clark", 27, "7890123456", "david.clark@email.com", 1);
        PartTime pt03 = new PartTime("P003", "Sophia Martinez", 33, "8901234567", "sophia.martinez@email.com", 40);
        PartTime pt04 = new PartTime("P004", "William Lee", 29, "9012345678", "william.lee@email.com", 50);
        PartTime pt05 = new PartTime("P005", "Olivia White", 26, "0123456789", "olivia.white@email.com", 35);

        Employee[] emp = {ft01, ft02, ft03, ft04, ft05, pt01, pt02, pt03, pt04, pt05};

        ServiceEmployee serviceEmployee = new ServiceEmployee();
        System.out.println("Average Salary: " + serviceEmployee.calculateAverageSalary(emp));

        for (Employee e : serviceEmployee.listEmployeesWithSalaryLowerThanAverage(emp)) {
            if (e != null) {
                System.out.println("Employee ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.calculateSalary());
            }
        }

        System.out.println("Total Salary For Part Time Employees: " + serviceEmployee.calculateTotalSalaryForPartTimeEmployees(emp));
    }
}
