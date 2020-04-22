package Day06_Shorthnd_LogicalOperators;

public class Logical_Operators {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1);

        boolean result2 =!( 10 + 15 > 15);
        System.out.println(result2);

        boolean result3 = !true == !false;
        System.out.println(result3);
    }
}
