import Employees.Employee;
import Employees.HourlyEmployee;
import Employees.SalariedEmployee;

import java.util.Scanner;
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter employee type (1 for hourly, 2 for salaried):");
            int type = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter employee age:");
            int age = sc.nextInt();
            System.out.println("Enter employee salary or hourly rate:");
            double salary = sc.nextDouble();
            if (type == 1) {
                System.out.println("Enter employee hours worked:");
                double hoursWorked = sc.nextDouble();
                employees[i] = new HourlyEmployee(name, age, salary, hoursWorked);
            } else if (type == 2) {
                employees[i] = new SalariedEmployee(name, age, salary);
            } else {
                System.out.println("Invalid employee type.");
                i--;
            }
        }

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " earned $" + emp.calculatePay());
        }
    }
}
