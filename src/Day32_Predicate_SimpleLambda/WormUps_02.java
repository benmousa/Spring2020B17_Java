package Day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class WormUps_02 {
    public static void main(String[] args) {

        /*
        2. write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["B", "D"]
         */

        String[] arr = {"A", "B", "A", "C", "D"};        // {"A"};

        String [] arr2 = {"A", "B", "B", "C", "D", "D"};  // {"B", "D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        ArrayList<String> listDup = new ArrayList<>();

        for (int z = 0; z <= list.size()-1; z++ ){
            int j = 0;
            for ( int i = 0; i <= list.size()-1; i++){
                if (list.get(i).equals(list.get(z)))
                    j++;
            }
            if ( j > 1 && ! listDup.contains(list.get(z))){
                listDup.add(list.get(z));
            }
        }
        System.out.println(listDup);



        System.out.println();
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(list2);
        System.out.println();


    }
}
