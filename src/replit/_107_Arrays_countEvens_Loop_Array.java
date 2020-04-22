package replit;

public class _107_Arrays_countEvens_Loop_Array {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 6, 3, 4};

     //   for ( int z = 0; z <= nums.length-1; z++){

            for (int i = 0; i <= nums.length - 1; i++) {
               // int j = 0;
                if (nums[i] % 2 == 0) {
                   // j = nums[i];
                    System.out.println(nums[i]);
                }
            }
       // }


    }}