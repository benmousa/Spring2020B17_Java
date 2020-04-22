package Day24_Methods;

public class String_Reverse {

    public static void Reverse (String str){

        String reverse ="";

        for ( int i = str.length()-1; i >= 0; i --){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

    }

    public static void main(String[] args) {

      //  String t = Reverse("CyberTek");
      String name =  Reverse2("CyberTek");
        System.out.println(name);
    }

    public static String Reverse2 (String str){

        String reverse ="";

        for ( int i = str.length()-1; i >= 0; i --){
            reverse += str.charAt(i);
        }
        return  reverse;
    }
}
