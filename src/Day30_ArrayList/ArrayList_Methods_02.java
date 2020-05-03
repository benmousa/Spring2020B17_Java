package Day30_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods_02 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("B");
        list1.add("A");
        list1.add("D");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("D");
        list2.add("C");

        Collections.sort(list1);
        Collections.sort(list2);

        boolean equals = list1.equals(list2);
        System.out.println(equals);

        System.out.println("><><><><><><><><><><><><><>");

        ArrayList<String > reversList1 = new ArrayList<>();

        for ( int i = list1.size()-1; i >= 0 ; i--){
            reversList1.add(list1.get(i));
        }
        System.out.println(reversList1);



    }
}
