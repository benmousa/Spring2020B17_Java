package Day24_Methods;

import java.util.Scanner;

public class zz {
    public static void Calculation(double num1, double num2, char operator){

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;

            default:
                System.out.println("Invalid");

        }}

    public static void main(String[] args) {
        Scanner data = new Scanner (System.in);

        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter num2: ");
            int num2 = scan.nextInt();
            System.out.println("Enter operator: ");
            char operator = scan.next().charAt(0);
            Calculation(num1, num2, operator);  // result of calculation
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("No")){
                break;
            }

        }

        }

    }

