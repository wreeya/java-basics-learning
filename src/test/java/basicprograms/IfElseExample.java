package basicprograms;
import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number between 1 to 10:");
        int num = sc.nextInt();
        if (num == 5) {
            System.out.println("Congratulations u won ");
        } else if (num >= 1 && num <= 10) {
            System.out.println("Sorry please try again next time");
        } else {
            System.out.println("U cant enter this num");
        }
        //If(condition){
        //code execution
        //}
//        elseif{
//            //code executes
//        }
//        else{
//            //code executes
//        }
        //if(condition){
            //if(condition){
//          }
//      }
    }
}
