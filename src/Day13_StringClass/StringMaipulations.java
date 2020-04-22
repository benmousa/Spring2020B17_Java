package Day13_StringClass;

public class StringMaipulations {

    public static void main(String[] args) {

        String str = "Cybertek";

        char ch1 = str.charAt(5);

        System.out.println(ch1 =='T');

        int totalLength = str.length();

        System.out.println(totalLength < 50);

        String str2 = "Today is a great day, Java is fun";

        int total = str2.length();

        System.out.println(total);
        System.out.println("===============");

        String s = "Cybertek";
        s = s.concat(" School ");

        System.out.println(s);

    }
}
