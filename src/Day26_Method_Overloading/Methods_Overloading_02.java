package Day26_Method_Overloading;

public class Methods_Overloading_02 {

    public static void main(String[] args) {
        sum2Numbers(10, 5);

        sum3Numbers(10, 5, 15);

        sum4Numbers(10,20,30,5);

        System.out.println("><><><><><><><><<><><><><><><><");

        sum(15,10,5);

        sum(5,10);
    }

    public static void sum2Numbers (int a, int b){
        System.out.println( a +b );
    }

    public static void sum3Numbers (int a, int b, int c){
        System.out.println( a + b + c );
    }

    public static void sum4Numbers (int a, int b, int c, int d){
        System.out.println( a + b + c + d );
    }
// ================================================================================

    public static void sum (int a, int b){
        System.out.println( a +b );
    }

    public static void sum (int a, int b, int c){
        System.out.println( a + b + c );
    }

    public static void sum (int a, int b, int c, int d){
        System.out.println( a + b + c + d );
    }


}
