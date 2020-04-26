package Day26_Method_Overloading;

public class test {
    public static int Frequency (String str, char ch){

        char[] arr = str.toCharArray();

        int count = 0;
        for (char each : arr ){
            if (each == ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "cybertek";
        String result = "";

        for ( int i = 0; i <= str.length()-1; i++){
            int num = Frequency(str, str.charAt(i));
            if ( num == 1){
                result += str.charAt(i);
            }
        }
       // System.out.println(result);

        String unique = Uniques(str);
        System.out.println(unique);
        System.out.println(unique);
        System.out.println(unique);
        //test test
        System.out.println(unique);

    }

    public static String Uniques (String str){
        String result = "";

        for ( int i = 0; i <= str.length()-1; i++){
            int num = Frequency(str, str.charAt(i));
            if ( num == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
