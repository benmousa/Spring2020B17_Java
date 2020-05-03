package replit;

public class _114_Arrays_find_non_duplicate_Loop {
    public static void main(String[] args) {

        int [] nums = {1, 1, 2, 3, 4, 3, 4};


        for ( int z = 0; z <= nums.length-1; z++){
            int j = 0;
            for ( int i = 0; i <= nums.length-1; i++){
                if ( nums[i] == nums[z]){
                    j++;
                }
            }
            if ( j == 1){
                System.out.println(nums[z]);
            }
        }

    }
}
