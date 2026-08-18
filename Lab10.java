import java.util.Scanner;

public class Lab10 {
    static class Student {
        String name;
        int rollNo;

        Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }
    }

    static void displayStudent(Student s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int roll = sc.nextInt();

        Student s = new Student(name, roll);
        displayStudent(s);
    }
}