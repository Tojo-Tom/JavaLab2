import java.util.Scanner;

public class Lab11 {
    static class Box {
        int l, b, h;

        Box(int l, int b, int h) {
            this.l = l;
            this.b = b;
            this.h = h;
        }

        int volume() {
            return l * b * h;
        }
    }

    static void largerBox(Box b1, Box b2) {
        int larger = Math.max(b1.volume(), b2.volume());
        System.out.println("Larger Box Volume = " + larger);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Box1 (l b h): ");
        Box box1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Box2 (l b h): ");
        Box box2 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());

        largerBox(box1, box2);
    }
}