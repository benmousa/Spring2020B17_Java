package Batch_12.Day_21;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int a = 9;
        while ( a > 8) {
            System.out.println("Hello World");
            a--;
        }
        System.out.println("_________________________________");
        System.out.println("Enter your sentence");
        String sent = data.nextLine();

        System.out.println("Enter word that you search");
        String wordSearch = data.next();

        int times = 0;
        while (sent.contains(wordSearch)){
            times++;
            sent = sent.replaceFirst(wordSearch, "");
        }
        System.out.println(times);

        System.out.println("_________________________________");



    }
}
