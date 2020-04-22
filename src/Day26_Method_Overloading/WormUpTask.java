package Day26_Method_Overloading;

import java.util.Arrays;

public class WormUpTask {
    /*
    1. write a method that can return the maximum number from an int array
    2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	 3. write a method that can return the minimum number from an int array
	 4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */

    public static void main(String[] args) {
        int[] array = {5, 35, 75, 25, 95, 55, 45};
       // Arrays.sort(array);


        int j = array.length-1;
        for (int i =  array.length-1; i >= 0; i--){
            array[j] = array[i];
            j--;
            //System.out.println(array[i]);
        }

        System.out.println("##########################");
        //int max2 = array[array.length-1];

        //System.out.println(max2);
        double[] arr2 = {5.7, 35.0, 75.6, 25.3, 95.15, 55.88, 55.45};

        char[] ch = {'A', 'C', 'F', 'G', 'D', 'E', 'H', 'B'};


        maxNumber(array);

        maxNumber(arr2);

        System.out.println("><><><><><><><><><><><><><><><");

        int[ ] des = Descending(array);
        System.out.println(Arrays.toString(des));

        double[] dess = Descending(arr2);
        System.out.println(Arrays.toString(dess));

        char[] desss = Descending(ch);
        System.out.println(Arrays.toString(desss));

        System.out.println("><><><><><><><><><><><><><><><");

    }

    public static void maxNumber (int[] arr){

        Arrays.sort(arr);

        int max = arr[arr.length-1];

        System.out.println(max);
    }

    public static void maxNumber (double[] arr){
        Arrays.sort(arr);

        double max = arr[arr.length-1];

        System.out.println(max);
    }

    public static void minNumber (int[] arr){

        Arrays.sort(arr);

        int min = arr[0];

        System.out.println(min);
    }

    public static void minNumber (double[] arr){

        Arrays.sort(arr);

        double min = arr[0];

        System.out.println(min);
    }

    public static int[] Descending (int[] arr){

        Arrays.sort(arr);

        int[] des = new int[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            des[j] = arr[i];
            j++;
        }

        return des;
    }

    public static double[] Descending (double[] arr){

        Arrays.sort(arr);

        double[] des = new double[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            des[j] = arr[i];
            j++;
        }

        return des;
    }

    public static char[] Descending (char[] arr){

        Arrays.sort(arr);

        char[] des = new char[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            des[j] = arr[i];
            j++;
        }

        return des;
    }



}
