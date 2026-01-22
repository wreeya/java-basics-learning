package basicprograms;

import java.util.Scanner;

public class BasicProgram {
    public static void main(String[] args){
        System.out.println("Please enter a num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("Hello World");
        System.out.println("This is a basic program");
        //Hi guys whats up? single line comments
        /*
        *My name is wreeya.multi line comments.
         */
        // [datatype] [variable_name] //variable declaration
        //varible declaration and variable initialization ho
        //primitive datatype=>single data holder
        // byte num1 = 3;//declaration is req but initialization is optional.
        short num2 = 4;
        int num3 = 5;
        float num4 = 6.1f;
        long num6 = 4L;
        double num5 = 200.5;
        boolean bool = true;
        char word = 'a';
        // non primitive datatype=>collection of smtg
        String name = "This is my name";
        //arrays
        String[] cars = {"BYD","Toyota","Honda","Tesla","Ferrari"};
        int[] numbers = {1,2,3,4,5,};



    }
}
