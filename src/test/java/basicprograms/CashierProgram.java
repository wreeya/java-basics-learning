import java.util.Scanner;

public class CashierProgram{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfItems, quantity, i;
        double totalAmt = 0, price, itemTotal;

        System.out.print("Enter number of items: ");
        numberOfItems = sc.nextInt();

        for (i = 1; i <= numberOfItems; i++) {

            System.out.println("\nItem " + i);

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            System.out.print("Enter price per item: ");
            price = sc.nextDouble();

            itemTotal = quantity * price;
            totalAmt += itemTotal;

            System.out.println("Cost for item " + i + " = " + itemTotal);
        }

        System.out.println("\nTotal Bill Amount = " + totalAmt);

        sc.close();
    }
}




//package basicprograms;
//import java.util.Scanner;
//public class CashierProgram {
//    public static void main(String[] args){
//        int price = 10 ;
//        int total = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no.of items :");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            System.out.println("Enter the quantity of the item "+ i + ":" );
//            int quantity = sc.nextInt();
//            int cost = (quantity * price);
//            total = total + cost;
//        }
//        System.out.println("The total price is "+ total);
//    }
//}
