package replit;

public class Positive_Negative38 {
    public static void main(String[] args) {
        double num = 32.5;
        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero = num == 0;

        if (positive){
            System.out.println(num+" is a positive number.");
        }

        if (negative){
            System.out.println(num+" is a negative number.");
        }
        if (zero){
            System.out.println( num+" is zero.");
        }
    }
}
