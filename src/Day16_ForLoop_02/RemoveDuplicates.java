package Day16_ForLoop_02;

public class RemoveDuplicates {
    public static void main(String[] args) {

     String str = "AAAAABBBCCCDDDBBBCCDDDAAACCCBBDDAAA,>...ZZ";

     String result = "ABC";

     for ( int z = 0 ; z <= str.length()-1 ; z++){
         if (!result.contains(""+str.charAt(z))){
             result += str.charAt(z);

         }

    }
        System.out.println(result);
}}
