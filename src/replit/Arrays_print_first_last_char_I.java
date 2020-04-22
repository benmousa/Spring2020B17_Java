package replit;

public class Arrays_print_first_last_char_I {
    public static void main(String[] args) {

       String [] words = {"hello", "why", "by", "apple" , "note"};

       for ( int i = 0; i <= words.length-1; i++){
       words[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1,words[i].length());
           System.out.println(words[i]);
       }

    }
}
