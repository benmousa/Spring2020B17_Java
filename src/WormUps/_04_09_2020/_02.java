package WormUps._04_09_2020;

public class _02 {
    public static void main(String[] args) {

        /* write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
	Hint: You need nested loops
         */

        String str = "AABCBCCCCCCCCCCCCA";
        String result = "";
        String result2 = "";

        for (int i = 0; i <= str.length()-1; i++){
            if ( !result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }}


        for ( int j = 0; j <= result.length()-1; j++) {
            int count =0;

            for (int z = 0; z <= str.length() - 1; z++) {
                if( str.charAt(z) == result.charAt(j)){
                count++;
            }}
            result2 += " "+result.charAt(j) + count;
        }
        System.out.println(result2);
}








    }

