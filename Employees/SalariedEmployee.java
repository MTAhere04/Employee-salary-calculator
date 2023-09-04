package Employees;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double calculatePay() {
        return getSalary() / 12;
    }

}
