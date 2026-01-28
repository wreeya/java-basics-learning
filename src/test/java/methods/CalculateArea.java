package methods;

import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the first room: ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of the first room: ");
        double breadth = sc.nextDouble();

        System.out.println("Enter the length of the second room: ");
        double length2 = sc.nextDouble();

        System.out.println("Enter the breadth of the first room: ");
        double breadth2 = sc.nextDouble();

        Rectangle room1 = new Rectangle(length, breadth);
        Rectangle room2 = new Rectangle(length2, breadth2);

        room1.calculateArea();
        room2.calculateArea();
    }
}

