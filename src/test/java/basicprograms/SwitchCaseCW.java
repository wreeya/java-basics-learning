package basicprograms;
import java.util.Scanner;
public class SwitchCaseCW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of food: ");
        String food = sc.nextLine();
        switch(food.toUpperCase()){
            case "PIZZA":
                System.out.println("The price is: 20$");
                break;
            case "BURGER":
                System.out.println("The price is: 15$");
                break;
            case "PASTA":
                System.out.println("The price is: 7$");
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
