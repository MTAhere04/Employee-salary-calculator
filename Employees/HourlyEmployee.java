package Employees;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, int age, double hourlyRate, double hoursWorked) {
        super(name, age, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    // getters and setters for hourlyRate and hoursWorked
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
