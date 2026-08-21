import java.util.Scanner;

public class Lab12 {
    static class Student {
        String name;
        int mark;
    }

    static Student createStudent(String name, int mark) {
        Student s = new Student();
        s.name = name;
        s.mark = mark;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Mark: ");
        int mark = sc.nextInt();

        Student s = createStudent(name, mark);
        System.out.println("Student Name : " + s.name);
        System.out.println("Mark : " + s.mark);
    }
}