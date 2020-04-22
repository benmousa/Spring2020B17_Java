package replit;

public class oddNum39 {
    public static void main(String[] args) {

        double num = 35.5;
        boolean oddNum = num % 2 == 0;
        boolean evenNum = num % 2 != 0;

        if (oddNum){
            System.out.println(num+" is an odd number.");
        }

        if (evenNum){
            System.out.println(num+" is an even number.");
        }

    }
}
