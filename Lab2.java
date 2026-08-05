import java.util.Scanner;

public class Lab2 {
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Salary : " + salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, salary);
        emp.display();
    }
}