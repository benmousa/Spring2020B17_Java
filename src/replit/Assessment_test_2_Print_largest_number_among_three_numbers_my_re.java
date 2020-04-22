package replit;

import java.util.*;

public class Assessment_test_2_Print_largest_number_among_three_numbers_my_re {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if ( num1 > num2 && num1 > num3){
            System.out.println("n1 is bigger");
        }
        if (num2 > num3 && num2 > num1){
            System.out.println("n2 is bigger");
        }
        if ( num3 > num1 && num3 > num2){
            System.out.println("n3 is bigger");
        }



    }
}
