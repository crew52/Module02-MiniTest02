package entity;

public class PartTime extends Employee {
    private int hours;
    private static int SALARY = 100;

    public PartTime(String id, String name, int age, String phoneNumber, String email, int hours) {
        super(id, name, age, phoneNumber, email);
        this.hours = hours;
    }

    public PartTime(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return hours * SALARY;
    }

    @Override
    public String toString() {
        return "Part Time: " + super.toString() + "Hours: " + hours + "\nSalary: " + calculateSalary();
    }
}
