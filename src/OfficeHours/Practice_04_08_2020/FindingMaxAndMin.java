package OfficeHours.Paractice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {

        Scanner data = new Scanner ( System.in);



        int i = 1;
        int max = 99999999;
        while ( i <= 3){
            i++;
            System.out.println("Enter a number");
            int num = data.nextInt();
            if (num < max){
                max = num;
            }
        }
        System.out.println(max);


    }

}
