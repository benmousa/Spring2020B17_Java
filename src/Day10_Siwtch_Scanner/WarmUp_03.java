package Day10_Siwtch_Scanner;

public class WarmUp_03 {
    public static void main(String[] args) {

        /*  write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF */

         int num = 4;
         String days = " ";

         if ( num >= 1 && num <= 12){
             days = ( num == 2 )? "28 Days" :(num == 4 || num == 6 || num == 9 || num  == 11 )? "30 Days"
                     :( num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12)? "31 Days":"";
             }
         else{
             days = "Invalid";
        }
        System.out.println(days);
}
                 }
