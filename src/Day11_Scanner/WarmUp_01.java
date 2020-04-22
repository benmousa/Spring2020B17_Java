package Day11_Scanner;

import java.util.Scanner;

public class WarmUp_01 {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your hourly rate here please");
        double hourlyRate = data.nextDouble();

        System.out.println("Enter your weekly working hours here please");
        double weeklyHour = data.nextDouble();

        System.out.println("Enter here the federal tax");
        double federalRate = data.nextDouble();

        System.out.println("Enter here the state tax");
        double stateRate = data.nextDouble();


        double federalTaxPer = federalRate / 100.0;
        double stateTaxPer = stateRate / 100.0;


        double salary = hourlyRate * weeklyHour * 48;
        double federalTax = salary / federalRate;
        double stateTax = salary / stateRate;
        double netSalary = salary - federalTax - stateTax;

        System.out.println("Your salary after taxes is $"+netSalary);

    }
}
