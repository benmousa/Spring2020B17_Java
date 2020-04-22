package Day25_Methods_Recap;

public class Paractice_Task_01_RmoveDuplicate {
    public static void main(String[] args) {

        String str = RemoveDupLicateicate("aaabbbccc");
        System.out.println(str);

        String str2 = "ABCABCABC";

        String result = RemoveDupLicateicate(str2);
        System.out.println(result);
    }


    public static String RemoveDupLicateicate (String str){

        String RemoveDupLicate = "";

        for ( int i = 0; i <= str.length()-1; i++){
            if ( ! RemoveDupLicate.contains(""+str.charAt(i))){
                RemoveDupLicate += str.charAt(i);
            }
        }
        return RemoveDupLicate;
    }
}
