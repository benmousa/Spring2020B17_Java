package Day24_Methods;

import java.util.Arrays;
public class Task {
     /*
    AccessModifier Specifier return-Type methodName(Paramter){
		}
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

    public static void MaxNumber(int [] array){
        Arrays.sort(array);
        System.out.println("Maximum Number is: "+array[array.length-1]);
    }
    public static void MinNumber (int[] array){
        Arrays.sort(array);
        System.out.println("Minimum Number is: "+array[0]);
    }
    public static void Desecnding (int[] array){
        Arrays.sort(array);

        for ( int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1,3,5,0,2};
        MaxNumber(arr);
        MinNumber(arr);
        Desecnding(arr);
    }

}
