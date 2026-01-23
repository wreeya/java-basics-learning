package basicprograms;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
//        while(i<=5){
//            System.out.println("The number is:"+i);
//            ++i;
//        }
//        do {
//            // code
//        } while (condition);
        int i = 1;
        do {

                System.out.println(i);
                i++;
        }
        while (i <= 5);
    }
}
