package replit;

import java.util.*;

public class Assessment_test_1_4_CalorieBurnedCalculator {
    public static void main(String[] args) {

        double weight = 0;
        double cal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        int weight2 = scan.nextInt();

        System.out.println("Enter time by minutes");
        int time = scan.nextInt();

        System.out.println("Enter MET for various activities");
        int met = scan.nextInt();

        double weightKg = weight2 / 2.205;
        double cal2 = 0.0175 * met * weightKg * time;

        System.out.println(cal2);



    }
}
