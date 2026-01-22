package basicprograms;
import java.util.Scanner;
public class AlgorithmClasswork {

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no of sales each salespeople made: ");
          int sale = sc.nextInt();
          int remaining = (10 - sale);
        if (sale >= 10) {
            System.out.println("Congratulations u have made a good sale");
        }
        else{
            System.out.println("Sales were short by: "+remaining);
        }
          int payment = 1000;
          int bonus = 250;
          int total = payment + bonus;
          System.out.println("Enter the no of sales of employee: ");
          int sales = sc.nextInt();
          if(sales > 10){
              System.out.println("U get payment with extra bonus: "+total);
          }
          else{
              System.out.println("U dont get a bonus: "+payment);
          }
          System.out.println("Enter the no of hrs worked: ");
          int hrs = sc.nextInt();
          System.out.println("Enter the hourly pay rate: ");
          double rate = sc.nextDouble();
          double result = (hrs * rate);
          System.out.println("Your result is: "+result);
    }
}



