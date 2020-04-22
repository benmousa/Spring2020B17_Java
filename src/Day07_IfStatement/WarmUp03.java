package Day07_IfStatement;

public class WarmUp03 {

    public static void main(String[] args) {
        /* write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal) */

        double a = 30;
        double b = 25;
        double c = 99;

        if (a < b && a < c ) {

            System.out.println(a + " is the minimum number");
        }
        if ( b < c && b < a) {

            System.out.println(b + " is the minimum number");
        }

        if ( c < a && c < b) {
            System.out.println(c + " is the minimum number");
        }




    }
}
