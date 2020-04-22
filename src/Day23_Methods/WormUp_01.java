package Day23_Methods;

public class WormUp_01 {
    public static void main(String[] args) {
        /*
        Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
         */

        String[] arr2 = {"A", "B", "B", "C"};

        for ( String each : arr2){
            int k = 0;
            for ( String each2 : arr2){
                if ( each2.equals(each)){
                    k++;
                }
            }
            if ( k ==1 ){
                System.out.println(each);
        }

        }
        System.out.println("><><><><><><><><><><><><><><><><><");

        String [] arr = {"A", "A", "B", "C", "C"};
        String result = " ";

        for (String each : arr){
            int d = 0;
            for ( int i = 0; i <=  arr.length-1; i++){
                if ( arr[i].equals(each)){
                    d++;
                }
            }
            if ( d == 1){
                System.out.println(each);
            }
        }
        System.out.println("================================");

        for ( String each2 : arr){
            int j = 0;
            for ( String each : arr) {
                if (each.equals(each2)) {
                    j++;
                }
            }
            if ( j == 1){
                System.out.println(each2);
            }

        }
        System.out.println("<><><><><><><><><><><><><><><><><>");

        for (int c = 0; c <= arr.length-1; c ++){
            int b = 0;
            for (int a = 0 ; a <= arr.length-1; a++){
                if ( arr[a].equals(arr[c])) {
                    b++;
                }
            }
            if ( b == 1){
                System.out.println(arr[c]);
            }
        }


}}

