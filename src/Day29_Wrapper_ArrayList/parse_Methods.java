package Day29_Wrapper_ArrayList;

public class parse_Methods {
    public static void main(String[] args) {

        String str = "123";

        int a = Integer.parseInt(str);

        System.out.println(a+1);

        Byte q = Byte.parseByte(str);
        System.out.println(q+3);

        String result = "true";

        boolean b = Boolean.parseBoolean(result);
        System.out.println( b);

        String result2 = "fAlSe";
        boolean d = Boolean.parseBoolean(result2);
        System.out.println(! d);


    }
}
