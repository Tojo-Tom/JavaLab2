import java.util.Scanner;

public class Lab5 {
    static class Student {
        String name;
        int age;

        Student() {
            System.out.println("Default Constructor");
        }

        Student(String name, int age) {
            this(); // calls default constructor first
            System.out.println("Parameterized Constructor");
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student s = new Student(name, age);
        s.display();
    }
}