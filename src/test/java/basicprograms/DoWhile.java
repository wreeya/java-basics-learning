package basicprograms;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter first no. :");
            int num1 = sc.nextInt();

            System.out.println("Enter second no. :");
            int num2 = sc.nextInt();

            int sum = (num1 + num2);
            System.out.println("Sum is: " + sum);

            System.out.println("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
