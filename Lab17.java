import java.util.Scanner;

public class Lab17 {
    static class Student {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        System.out.println("Student Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}