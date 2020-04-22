package Day24_Methods;

public class return_Method {
    public static int Sum (int a, int b){

        return a+b;
    }

    public static void main(String[] args) {
        int result = Sum(1,5);
        System.out.println(result);

        int result2 = result + 2;
        System.out.println(result2);
    }
}
