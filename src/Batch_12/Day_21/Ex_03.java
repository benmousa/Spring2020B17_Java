package Batch_12.Day_21;

import java.util.Scanner;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter start number");
        int start = data.nextInt();

        System.out.println("Enter end number");
        int end = data.nextInt();

        int i = start;
        while (i <= end){
            if (i %2 ==0){
            System.out.println("Hello: "+i);
        }
            i++;
    }


    }
}
