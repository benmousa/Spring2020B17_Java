package Day35_Static;

import java.util.Scanner;

public class staticPractice {

    static Scanner data = new Scanner ( System.in);

    public static void main(String[] args) {

        //Scanner data = new Scanner ( System.in);

        System.out.println("Enter num1");
        int num1 = data.nextInt();

        System.out.println("Enter num2");
        int num2 = data.nextInt();

        System.out.println("sum is: "+(num1+num2));
    }

    public void method1(){
        Scanner data = new Scanner ( System.in);

        System.out.println("Enter num1");
        int num1 = data.nextInt();

        System.out.println("Enter num2");
        int num2 = data.nextInt();

        System.out.println("Multiplication: "+(num1 * num2));
    }



}
