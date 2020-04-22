package Day24_Methods;

public class WormUp_03 {
    /*
     write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
     */

    public static void palindrome (String str){

        str = str.toLowerCase();
        String reverse = "";
        for ( int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(str.equalsIgnoreCase(reverse));
    }

    public static void main(String[] args) {
        palindrome("kayak");
    }




}
