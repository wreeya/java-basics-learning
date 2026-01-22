package basicprograms;

import java.util.Scanner;

public class BasicProgram {
    public static void main(String[] args){    //public=>acccess modifier, static=>non acccess modifier, void=>return type,main=>method's name
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
        System.out.println(num3);
        System.out.println(bool);
        System.out.println("The num is: "+num4);//+ is an operator append garera op generate garna use this
        // non primitive datatype=>collection of smtg
        String name = "This is my name";
        //arrays
        String[] cars = {"BYD","Toyota","Honda","Tesla","Ferrari"};
        int[] numbers = {1,2,3,4,5,};
        System.out.println(name);
        System.out.println(numbers[3]);
        System.out.println(cars[4]);
        // naming conventions
        //classes are written in PascalCase
        //each word starts with capital letter.
        //method name are written in camelCase.doLogin,camelCase
        //$ _ bahek varibale ko naam aru lekhna painna.
        //conctsnt variable
        double PI = 3.14;
        //Package names are written in reverse order.
        // www.broadway.com
        //com.broadway
        //packages are alwz written in lowercase.
        //block of statement=>{},[]=>arrays,()=>method is in parenthesis
    }
}
