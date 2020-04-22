package Day25_Methods_Recap;

public class Task {

    public static String RemoveDuplicate(String word ){

        String result = "";

        for ( int i =  0; i <= word.length()-1; i++){
            if ( ! result.contains(""+word.charAt(i))){
                result += word.charAt(i);
            }
        }
        return result;
    }

    public static int Frequency (String str1, String str2){
        int count = 0;

        while ( str1.contains(str2)){
            count ++;
            str1 = str1.replaceFirst(str2, "");
        }
        return count;
    }

    public static void main(String[] args) {

        String word = RemoveDuplicate("aabbccddeeff");

        System.out.println(word);
        System.out.println("><><><><><><><><><><><><><><><><><");

        String str1 = "javajavajavajava";
        String str2 = "java";

        int count = Frequency("aaaaabbbbccc","a");
        System.out.println(count);


    }
}
