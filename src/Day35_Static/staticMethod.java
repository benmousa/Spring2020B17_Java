package Day35_Static;

public class staticMethod {
    int a = 100;
    static int b = 200;

    public static void main(String[] args) {
       // System.out.println(a);

        staticMethod obj = new staticMethod();

        System.out.println(obj.a);
        System.out.println("##############################");

        System.out.println(b);
        System.out.println(staticMethod.b);
        System.out.println(obj.b);

    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }
}
