package Day26_Method_Overloading;

public class Methods_Overloading_03 {

    public static void main(String[] args) {

        sum(20,30);

        double num = sum(1.5,2.5);
        System.out.println(num);

        double num1 = sum(10,11.5);
        System.out.println(num1);

        double num2 = sum(21L, 25L);
        System.out.println(num2);

    }

    public static void sum (int a , int b){
        System.out.println( a + b );
    }

    public static double sum (double a , double b){
        return a + b;
    }
}
