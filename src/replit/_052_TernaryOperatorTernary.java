package replit;

public class _052_TernaryOperatorTernary {
    public static void main(String[] args) {


    /* Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5 */

        int x = 5;

        String x2 = (x > 5) ? x + " is greater than 5" :(x == 5 )? x+" is egual to 5." : x+" is less than 5.";

        System.out.println(x2);

    }

}
