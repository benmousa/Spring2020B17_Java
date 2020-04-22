package replit;

public class _106_Arrays_Split_Sentence_Loop_String {
    public static void main(String[] args) {

        String sentence = "Java is fun";

        String[] result = sentence.split(" ");

        for (String each : result){
            System.out.println(each);
        }
    }
}
