import java.util.Scanner;

public class Lab19 {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Fahrenheit = " + celsiusToFahrenheit(c));
    }
}