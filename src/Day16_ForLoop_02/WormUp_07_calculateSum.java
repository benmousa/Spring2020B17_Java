package Day16_ForLoop_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WormUp_07_calculateSum {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your number");
        int num = data.nextInt();

        int sum = 0;
        for (int z = 1 ; z <= num ; z++){
            sum += z;
        }
        System.out.print(sum+" ");
    }
}
