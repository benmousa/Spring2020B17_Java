package Day07_IfStatement;

public class WarmUp04 {
    public static void main(String[] args) {

        /* write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal) */

        int a = 3_555_654;
        int b = 6_555_654;
        int c = 5_555_654;

        if ( a > b && a < c || a < b && a > c) {
            System.out.println( a + " is the medium number"); }

        if ( b > a && b < c || b < a && b > c){
            System.out.println( b +" is the medium number");}

        if ( c > b && c < a || c < b && c > a){
            System.out.println(c + " is the medium number");
        }



    }
}


