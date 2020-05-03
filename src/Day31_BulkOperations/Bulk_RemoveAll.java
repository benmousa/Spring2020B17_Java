package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {

        String [] arr = {"Ali", "Ahmed", "Adel", "Ammar", "Adel", "Abdo",  "Ali"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        System.out.println();

        ArrayList<String > list2 = new ArrayList<>();

        for (int i = 0; i <= list.size()-1; i++ ){
         if (! list2.contains(list.get(i))){
             list2.add(list.get(i));

         }
        }
        System.out.println(list2);

    }
}
