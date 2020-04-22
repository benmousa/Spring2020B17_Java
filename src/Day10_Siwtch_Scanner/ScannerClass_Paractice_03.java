package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_Paractice_03 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println(" Enter your number here");
        int num1 = data.nextInt();

        System.out.println("Enter your number here");
        int num2 = data.nextInt();

        System.out.println("Enter your number here");
        int num3 = data.nextInt();

        int maxNum = (num1 >= num2 && num1 >= num3)? num1 :( num2 >= num1 && num2 >= num3)? num2 : num3;
        int minNum = (num1 <= num2 && num1 <= num3)? num1 :( num2 <= num1 && num2 <= num3)? num2 : num3;

        System.out.println("The maximum number is "+maxNum+" and the minimum number is "+minNum);
    }
}
