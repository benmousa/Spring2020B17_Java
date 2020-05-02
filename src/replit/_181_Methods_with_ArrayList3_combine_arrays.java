package replit;

public class _181_Methods_with_ArrayList3_combine_arrays {
    public static void main(String[] args) {

        // ["f","o","o"],[" b","a","r"]

        String[] arr = {"f","o","o"};

        String [] arr2 = {" b","a","r"};


        String result = "";
        String result2 = "";

        for (String each2 : arr) {
            result += each2;
        }

            for ( String each : arr2){
                result2 += each;
            }

        String result3 = result + result2;

            combineRs(arr,arr2);

        }

    public static String combineRs(String[] r1, String[] r2){
        String result = "";
        String result2 = "";

        for (String each : r1) {
            result += each;
        }

        for ( String each : r2){
            result2 += each;
        }
        String result3 = result + result2;
        System.out.println(result3);

        return result ;
    }
}
