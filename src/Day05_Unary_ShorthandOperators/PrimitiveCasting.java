package Day05_Unary_ShorthandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int a = 10;
        long b = a;

        int a1 = 100;
        long b1 = (long) a1;

        System.out.println(b);

        System.out.println(b1);
    }
}
