import java.util.Scanner;

public class Lab4 {
    static class Student {
        String name;
        int age;

        void setData(String name, int age) {
            this.name = name; // this.name = instance variable
            this.age = age;
        }

        void display() {
            System.out.println("Student Name : " + name);
            System.out.println("Age : " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student s = new Student();
        s.setData(name, age);
        s.display();
    }
}