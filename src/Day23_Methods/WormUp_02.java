package Day23_Methods;

public class WormUp_02 {
    public static void main(String[] args) {

        /*
        Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
         */

        int[] arr = {1,1,2,3,3};

       for ( int d= 0; d <= arr.length-1; d++){
           int j = 0;
           for ( int i = 0; i <= arr.length-1; i++){
               if ( arr[i] == arr[d]){
                   j++;
               }
           }
           if ( j == 1 ){
               System.out.println(arr[d]);
           }
       }



    }}
