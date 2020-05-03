package Day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WormUp_01_MoveZero_02 {
    public static void main(String[] args) {

        Integer[] arr =  {1,0,2,0,3,0,4,0};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        int count = Collections.frequency(list,0);
        System.out.println(count);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for  ( int i = 0 ; i <= count-1; i++){
           // list.add(0);
            list.add(0,0);
        }
        System.out.println(list);
    }
}
