package replit;

public class _102_Arrays_Reverse_Sentence_Loop_Array {
    public static void main(String[] args) {

        String sentence = "Java is fun";

        String[] result = sentence.split(" ");


        String result2 = "";

        for ( int z = result.length-1; z >=0 ;  z--){
            for ( int i = result.length-1; i >= 0; i--){
                result[i].equals(result[z]);
        }
            System.out.println(result[z]);
        }
        //System.out.println(result2);
    }
}
