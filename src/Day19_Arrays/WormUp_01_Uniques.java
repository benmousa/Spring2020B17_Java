package Day19_Arrays;

public class WormUp_01_Uniques {
    public static void main(String[] args) {

     //   Scanner data = new Scanner (System.in);

       // System.out.println("Please enter your word");
     //   String word = data.next();

        String str = "ABABCDESSFFG";
        String result = " ";

        for ( int j = 0; j <= str.length()-1; j++){
            int count = 0;
            char ch = str.charAt(j);

            for (int i = 0; i <= str.length()-1; i++){
                char ch2  = str.charAt(i);
                if ( ch == ch2 ){
                    count++;
                }
            }
            if ( count == 1){
                result+= str.charAt(j);
            }
        }
        System.out.println(result);



        /*        int length = word.length();
        char middleChar = word.charAt(length / 2);

        System.out.println(middleChar);

 */

    }
}
