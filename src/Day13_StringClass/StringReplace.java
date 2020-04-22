package Day13_StringClass;

public class StringReplace {
    public static void main(String[] args) {

        String str = " Libya is bad and poor country, Libya has so poor people who have bad behaiveor";
               str = str.replaceFirst("poor","rich");
               str = str.replaceFirst("bad","good");

        System.out.println(str);
    }
}
