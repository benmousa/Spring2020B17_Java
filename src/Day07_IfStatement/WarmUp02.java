package Day07_IfStatement;

public class WarmUp02 {
    public static void main(String[] args) {
        /* write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal) */

        int a = 9_678_785;
        long b = 565_467_87l;
        long c = 8_344_57l;

        if ( a > b && a > c) {
            System.out.println(a + " is the maximun number");
        }

        if ( b > c && b > a) {
            System.out.println(b + " is the maximum number");
        }

        if ( c > a && c > b) {

            System.out.println(c + " is the maximum number");

        }
    }

}
