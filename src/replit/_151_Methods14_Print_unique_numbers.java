package replit;

public class _151_Methods14_Print_unique_numbers {
    public static void main(String[] args) {
        /*
        Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
        Example:
        input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
        output:
        2
        9
        34
         */

        int [] arr = {2, 5, 5, 6, 3,2, 11, 6, 9, 34, 3};

        printUniqueNumbers(arr);

    }
    public static void printUniqueNumbers(int[] nums){
        for ( int z = 0; z <= nums.length-1; z++){
            int count = 0;
            for (int i = 0; i <= nums.length-1; i++ ){
                if ( nums[i] == nums[z]){
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(nums[z]);
            }
        }
    }


}
