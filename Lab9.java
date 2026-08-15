import java.util.Scanner;

public class Lab9 {
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();
        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Breadth: ");
        int b = sc.nextInt();

        System.out.println("Area of Square = " + area(side));
        System.out.println("Area of Rectangle = " + area(l, b));
    }
}