package Day30_ArrayList;

import java.util.ArrayList;

public class WormUp3_Uniqe_Num {
    public static void main(String[] args) {
        /*
        3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
         */

        int[] array = {1,1,2,3,3,4,5};

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);

        ArrayList<Integer> uniques = new ArrayList<>();

        for ( int z = 0; z <= list.size()-1; z++){
            int j = 0;
            for (int i = 0; i <= list.size()-1; i++){
                if ( list.get(i) == list.get(z) ){
                    j++;
                }
                }
            if ( j == 1){
                uniques.add(list.get(z));
            }
        }
        System.out.println(uniques);

    }
}
