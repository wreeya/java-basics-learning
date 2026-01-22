package basicprograms;
import java.util.Scanner;

public class OperatorExamples {
    public static void main(String[] args){
        System.out.println("Please enter your name:" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your namse is: "+name);
        String Car = "BYD";
        String car = "Toyota";
//Java is case sensitive.
//        sc.nextInt();
//        sc.nextDouble();
//        sc.next();//String
//        sc.nextLine();//
//        sc.nextBoolean();
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println((a>b)&&(b<c));//False
        System.out.println((a>b)||(b<c));//True
        System.out.println(a>b);
        System.out.println(a!=b);
    }
}
