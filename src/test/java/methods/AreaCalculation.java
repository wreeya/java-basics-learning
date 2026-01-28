package methods;
import java.util.Scanner;

public class AreaCalculation {
    Scanner sc = new Scanner(System.in);
    public double length;
    public double breadth;

    public void enterLength(){
        System.out.print("Enter length of the room ");
        length = sc.nextDouble();
    }
    public void enterBreadth(){
        System.out.print("Enter breadth of the room ");
        breadth = sc.nextDouble();
    }
    public void area(){
        double area = length * breadth;
        System.out.print("The area of the room is: " +area);
    }
}

