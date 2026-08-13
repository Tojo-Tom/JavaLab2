import java.util.Scanner;

public class Lab8 {
    static void display(int i) {
        System.out.println("Integer : " + i);
    }

    static void display(double d) {
        System.out.println("Double : " + d);
    }

    static void display(String s) {
        System.out.println("String : " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer: ");
        int i = sc.nextInt();
        System.out.print("Double: ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.print("String: ");
        String s = sc.nextLine();

        display(i);
        display(d);
        display(s);
    }
}