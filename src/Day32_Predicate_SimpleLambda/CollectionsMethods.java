package Day32_Predicate_SimpleLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {

        Integer[] arr =  {1,5,2,6,3,8,4,7};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

      Collections.swap(list, 0, 3);
        System.out.println(list);

        int max= Collections.max(list);
        System.out.println("Max Num is: "+max);

        int min = Collections.min(list);
        System.out.println("Min Num is: "+min);

        list.removeAll(Arrays.asList(max));
        //System.out.println(list);

       int secondMax = Collections.max(list);
        System.out.println("Second Max Num is: "+secondMax);

        list.removeAll(Arrays.asList(min));
        //System.out.println(list);

       int secondMin = Collections.min(list);
        System.out.println("Second Min Num is: "+secondMin);



    }
}
