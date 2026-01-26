package basicprograms;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;


    int area() {
        return length * breadth;
    }
}

public class HouseArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Rectangle room1 = new Rectangle();
        System.out.print("Enter length of room 1: ");
        room1.length = sc.nextInt();
        System.out.print("Enter breadth of room 1: ");
        room1.breadth = sc.nextInt();


        Rectangle room2 = new Rectangle();
        System.out.print("Enter length of room 2: ");
        room2.length = sc.nextInt();
        System.out.print("Enter breadth of room 2: ");
        room2.breadth = sc.nextInt();

        int totalArea = room1.area() + room2.area();

        System.out.println("Total area of two rooms: " + totalArea);
    }
}
