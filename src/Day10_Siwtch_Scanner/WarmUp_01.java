package Day10_Siwtch_Scanner;

public class WarmUp_01 {
    public static void main(String[] args) {

        /* write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF 8
         */
        int num = 2;
        String day = " ";

        if ( num >= 1 && num <= 7 ){
             if ( num == 1){
                 day = "Monday";
             }
             else if (num == 2){
                 day = "Tuesday";
             }
             else if (num == 3){
                 day = "Wednesday";
             }
             else if (num == 4){
                 day = "Thursday";
             }
             else if (num == 5){
                 day = "Friday";
             }
             else if (num == 6){
                 day = "Saturday";
             }
             else if ( num == 7){
                 day = "Sunday";
             }
        }
        else {
            day = "Invaild";
        }
        System.out.println(day);


    }
}
