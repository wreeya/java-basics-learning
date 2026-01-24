package basicprograms;
import java.util.Scanner;

public class GreetUser {


    public static void greetUser() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello"  + name);
    }

    public static void main(String[] args) {
        greetUser();
    }
}

