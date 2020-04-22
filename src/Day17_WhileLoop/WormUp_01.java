package Day17_WhileLoop;

import java.util.Scanner;

public class WormUp_01 {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        int maxNum = 0;

        for (int i = 1 ; i <= 5 ; i++){
        System.out.println("Please enter your Number");
        int num = data.nextInt();

        if (num > maxNum){
            maxNum = num;
        }
    }
        System.out.println("The Maximum number is: "+maxNum);
}}
