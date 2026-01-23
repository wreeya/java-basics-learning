package basicprograms;
import java.util.Scanner;
public class CashierProgram {
    public static void main(String[] args){
        int price = 10 ;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of items :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter the quantity of the item "+ i + ":" );
            int quantity = sc.nextInt();
            int cost = (quantity * price);
            total = total + cost;
        }
        System.out.println("The total price is "+ total);
    }
}
