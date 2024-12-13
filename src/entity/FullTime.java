package entity;

public class FullTime extends Employee {
    private double salary;
    private double bonus;
    private double penalties;

    public FullTime(String id, String name, int age, String phoneNumber, String email, double salary, double bonus, double penalties) {
        super(id, name, age, phoneNumber, email);
        this.salary = salary;
        this.bonus = bonus;
        this.penalties = penalties;
    }

    public FullTime(double salary, double bonus, double penalties) {
        this.salary = salary;
        this.bonus = bonus;
        this.penalties = penalties;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalties() {
        return penalties;
    }

    public void setPenalties(double penalties) {
        this.penalties = penalties;
    }

    @Override
    public double calculateSalary() {
        return salary + (bonus - penalties);
    }

    @Override
    public String toString() {
        return "Full Time: " + super.toString() +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", penalties=" + penalties +
                '}';
    }
}
