package Day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class WormUps_01 {
    public static void main(String[] args) {

        /*
        1. Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
         */
        Integer[] arr =  {1,0,2,0,3,0,4,0};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        int j = 0;
        for (Integer each : list ){
            if ( each == 0){
                j++;
            }
        }

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        for (int i = 0; i<= j-1; i++){
            list.add(0,0);
        }
        System.out.println(list);









    }
}
