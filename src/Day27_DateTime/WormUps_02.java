package Day27_DateTime;

public class WormUps_02 {
     /*
    		1. write a return method that can return the minimum number from an int array
    		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
			3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
			4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */

    public static void main(String[] args) {

        int[] arr = { 25, 5, 65, 15, 85, 35, 95, 55, 75, 45};


            int max = arr[0];

        for ( int each : arr){
            if ( each > max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
