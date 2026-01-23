package basicprograms;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int RATE = 15;
        int hours;

        System.out.println("Enter number of hours worked:");
        hours = sc.nextInt();

        while (hours > 40) {
            System.out.println("Overtime is not allowed. Enter hours (max should be 40):");
            hours = sc.nextInt();
        }
        int pay = hours * RATE;
        System.out.println("Weekly pay is: $" + pay);
    }
}

