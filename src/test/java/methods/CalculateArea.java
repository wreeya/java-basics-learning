package methods;

import java.util.Scanner;

public class CalculateArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the room: ");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of the room: ");
        double breadth = sc.nextDouble();

        Rectangle rec = new Rectangle(length, breadth);
        rec.calculateArea();
    }
}

