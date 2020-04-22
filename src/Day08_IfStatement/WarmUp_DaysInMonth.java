package Day08_IfStatement;

public class WarmUp_DaysInMonth {
    public static void main(String[] args) {

      /* write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 	28 days: 2
        30 days: 4,6,9,11
        31 days: 1,3,5,7,8,10,12*/

      int month = 13;

      boolean Days31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
      boolean Days30 = month == 4 || month == 6 || month == 9 || month == 11;
      boolean Days28 = month == 2;
      boolean Days32 = month > 12;


      if (Days28){
          System.out.println("It has 28 days.");}

          if (Days30){
              System.out.println("It has 30 days.");}
          if (Days31){
              System.out.println("It has 31 days");}
          if (Days32){
              System.out.println("There is no year has this number");
          }



    }
}
