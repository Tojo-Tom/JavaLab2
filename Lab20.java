import java.util.Scanner;

public class Lab20 {
    static final double PI = 3.14;

    static double area(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        System.out.println("Area = " + area(radius));
    }
}