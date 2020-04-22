package Day24_Methods;

import java.util.Scanner;

public class WormUp_01 {

    public static void Max (int num1, int num2){
        if ( num1 >= num2){
            System.out.println("Maximum Number is: "+num1);
        }
        else{
            System.out.println("Maximum Number is: "+num2);
        }
    }

    public static void Calculator(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid");
        }
    }



        public static void main (String[]args){

            int a = 10;
            int b = 20;
            Max(10, 20);
            System.out.println("><><><><><><><><><><><><><><><><");

            Scanner data = new Scanner (System.in);

            while (true){
                System.out.println("Enter num1");
                int num1 = data.nextInt();

                System.out.println("Enter operator");
                char operator = data.next().charAt(0);

                System.out.println("Enter num2");
                int num2 = data.nextInt();

                Calculator(num1, num2, operator);

                System.out.println("Do you want to continue?");
                String cont = data.next();

                while (  !( cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("no"))  ){
                    System.out.println("Invalid entry re-enter");
                    System.out.println("Do you want to continue?");
                    cont = data.next();
                }

                if ( cont.equalsIgnoreCase("no")){
                    break;
                }
            }

        }
    }
