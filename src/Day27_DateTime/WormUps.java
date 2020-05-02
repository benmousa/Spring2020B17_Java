package Day27_DateTime;

public class WormUps {
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
        int[] arr2 = { 3, 1, 2, 3, 3 };

        int minNumber = arr[0];

        for ( int i = 0; i <= arr.length-1; i++){
            if ( arr[i] < minNumber ){
                minNumber = arr[i];
            }
        }
        //System.out.println(minNumber);


        for ( int z = 0 ; z <= arr2.length-1; z++){
            int unique = 0;
            for ( int i = 0; i <= arr2.length-1; i++){
                if (arr2[i] == arr2[z]){
                    unique++;
                }
                }
            if ( unique == 1){
                    System.out.println(arr2[z]);
        }
        }

        int min = minNumber(arr2);
      //  System.out.println(min);

        System.out.println("=============");
        Unique(arr2);
        System.out.println("=============");
    }

    public static int minNumber (int[] arr){

        int minNumber = arr[0];

        for ( int i = 0; i <= arr.length-1; i++){
            if ( arr[i] < minNumber ){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static double minNumber (double[] arr){

        double minNumber = arr[0];

        for ( int i = 0; i <= arr.length-1; i++){
            if ( arr[i] < minNumber ){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }

    public static void Unique (int[] arr){

        for ( int z = 0 ; z <= arr.length-1; z++){
            int unique = 0;
            for ( int i = 0; i <= arr.length-1; i++){
                if (arr[i] == arr[z]){
                    unique++;
                }
            }
            if ( unique == 1){
                System.out.println(arr[z]);
            }
        }
    }

    public static void Unique (double[] arr){

        for ( int z = 0 ; z <= arr.length-1; z++){
            int unique = 0;
            for ( int i = 0; i <= arr.length-1; i++){
                if (arr[i] == arr[z]){
                    unique++;
                }
            }
            if ( unique == 1){
                System.out.println(arr[z]);
            }
        }
    }




}
