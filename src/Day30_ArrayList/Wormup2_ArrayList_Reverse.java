package Day30_ArrayList;

import java.util.ArrayList;

public class Wormup2_ArrayList_Reverse {
    public static void main(String[] args) {
        /*
        2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
         */

        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++){
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> listReverse = new ArrayList<>();
        int num = 0;
        for ( int i = list.size()-1; i >= 0; i--){
          //  num  = list.get(i);
            listReverse.add(list.get(i));
        }
        System.out.println(listReverse);




    }
}
