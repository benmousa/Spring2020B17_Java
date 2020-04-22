package Day25_Methods_Recap;

public class Paractice_Task_02_Frequency {
    public static void main(String[] args) {

        String str = "AAABB";
        String str2 = "A";
        int count = 0;

        for ( int i = 0; i <= str.length()-1; i++){
            if (  str.contains(str2)){
                count++;
                str = str.replaceFirst(str2, "");
            }
        }

    }
}
