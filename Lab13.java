import java.util.Scanner;

public class Lab13 {
    static class Circle {
        double radius;
        double area;
    }

    static Circle createCircle(double radius) {
        Circle c = new Circle();
        c.radius = radius;
        c.area = Math.PI * radius * radius;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Circle c = createCircle(radius);
        System.out.println("Radius = " + c.radius);
        System.out.printf("Area = %.2f%n", c.area);
    }
}