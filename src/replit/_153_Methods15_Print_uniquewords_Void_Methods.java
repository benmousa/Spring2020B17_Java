package replit;

public class _153_Methods15_Print_uniquewords_Void_Methods {
    public static void main(String[] args) {

        String [] str = {"java", "code","Mohammed","Mohammed", "python", "code", "rust","Ali", "code", "rust"};

        printUniqueWords(str);

    }
    public static void printUniqueWords(String[] words){
        String result ="";

        for ( int z = 0; z <= words.length-1; z++){
            int count = 0;
            for ( int i = 0; i <= words.length-1; i++){
                if ( words[i].equals(words[z]) ){
                    count++;
                }
            }
            if ( count == 1){
                System.out.println(words[z]);
            }
        }
    }
}
