package Day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WormUps_02_AnotherSolution {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "A", "C", "D",  "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        ArrayList<String> result = new ArrayList<>();

        for ( String each : list){
            int count = Collections.frequency(list,each);
            if (count > 1 && ! result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);





    }
}
