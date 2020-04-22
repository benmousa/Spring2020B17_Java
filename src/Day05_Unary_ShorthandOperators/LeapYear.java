package Day05_Unary_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {


        System.out.println("2020 is leap year: " + (10 / 2 != 0) );

        System.out.println("65 is divisible by 2: " + (65 / 2 == 0) ); // odd num
        System.out.println("65 is divisible by 3: "+ (65 / 3 == 0 ) ); // odd num
        System.out.println("65 is divisible by 5: " + ( 65 / 5 != 0) ); // even num

        System.out.println("\n");

        System.out.println("80 is divisible by 2: " + (80 / 2 != 0) ); // even num
        System.out.println("80 is divisible by 3: "+ (80 / 3 == 0 ) ); // odd num
        System.out.println("80 is divisible by 5: " + ( 80 / 5 != 0) ); // even num
        System.out.println();

        System.out.println("================================================================================");

        int year = 2020;
        boolean leapYear = year % 4 == 0;

        System.out.println( year + " is leap year: " + leapYear);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



    }
}
