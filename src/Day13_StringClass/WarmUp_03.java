package Day13_StringClass;

import java.util.Scanner;

public class WarmUp_03 {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your number please");
        int num = data.nextInt();

        String result = " ";
        switch (num) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Invaild";

        }
        System.out.println("The number that you have enterned is: "+result);

    }
}
