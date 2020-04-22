package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_Paractice_02 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your salary here please");
        double salary = data.nextInt();

        System.out.println("Enter how many hours do you work per week here please");
        double hour = data.nextInt();

        System.out.println("enter the number of weeks that you work per year here please");
        int week = data.nextInt();

        double total =  (salary / week ) / hour;
        System.out.println("your hourly rate is: $"+total);
    }


}
