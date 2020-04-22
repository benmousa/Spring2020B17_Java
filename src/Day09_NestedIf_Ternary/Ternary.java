package Day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num =99;
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        System.out.println("===============================================================");

        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if ( num1 > num2){
            max = num1;
        }
        else{
            max = num2;
        }
        System.out.println(max);


        int max2 = (num1 > num2) ? num1 : num2;
        System.out.println(max2);

        }



    }

