package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_AddAll {
    public static void main(String[] args) {


        Integer[] num = {1,2,3,4,5,6,7,8,9,10,};
        Integer[] num2 = {11,12,13,14,15,16,17,18,19,20};


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(num));

        list.addAll(Arrays.asList(num2));

        System.out.println(list);


    }
}
