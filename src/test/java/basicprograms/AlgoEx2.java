package basicprograms;
import java.util.Scanner;
public class AlgoEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sal of a person");
        int sal = sc.nextInt();
        if(sal >= 30000){
            System.out.println("enter the no of years worked");
            int years = sc.nextInt();
            if(years >= 2){
                System.out.println("U are qualified for the loan");
            }else{
                System.out.println("U are not quite experienced");
            }
        }
        else{
            System.out.println("U are not qualified for the loan");
        }
        System.out.println("Enter the score of the student:");
        int score = sc.nextInt();
        if(score > 90){
            System.out.println("Grade:A+");
        }
        else if(score > 80){
            System.out.println("Grade: A");
        }
        else if(score > 70){
            System.out.println("Grade: B+");
        }
        else if(score > 60){
            System.out.println("Grade: B");
        }
        else if(score > 50){
            System.out.println("Grade: C+");
        }
        else if(score > 40){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        }
    }
}
