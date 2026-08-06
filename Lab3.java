import java.util.Scanner;

public class Lab3 {
    static class Rectangle {
        int length, breadth;

        Rectangle() {
            length = 1;
            breadth = 1;
        }

        Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        int area() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle(); // default
        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Breadth: ");
        int b = sc.nextInt();
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());
    }
}