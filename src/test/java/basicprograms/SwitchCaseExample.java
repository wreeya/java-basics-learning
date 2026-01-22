package basicprograms;
import java .util.Scanner;
public class SwitchCaseExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the day of a week:");
        String day = sc.nextLine();
        switch(day.toUpperCase()){
            case "SUNDAY":
                System.out.println("This is a first day of the week. ");
                break;
            case "MONDAY":
                System.out.println("This is a second day of the week. ");
                break;
            case "TUESDAY":
                System.out.println("This is the third day of the week.");
                break;
            case "WEDNESDAY":
                System.out.println("This is the fourth day of the week.");
                break;
            case "THURSDAY":
                System.out.println("This is the fifth day of the week.");
                break;
            case "FRIDAY":
                System.out.println("This is a second last day of the week.");
                break;
            case "SATURDAY":
                System.out.println("This is the last day of the week.");
                break;
            default:
                System.out.println("Invalid.");
        }


    }
}
