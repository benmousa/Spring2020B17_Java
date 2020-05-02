package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice_02 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(60);

        int maxNum = Integer.MIN_VALUE;

        for ( Integer each : array){
            if ( maxNum < each){
                maxNum = each;
            }
        }
        System.out.println(maxNum);

        int maxNum2 = Integer.MIN_VALUE;

        for ( int i = 0; i <= array.size()-1; i++){
            if ( maxNum2 < array.get(i)){
                maxNum2 = array.get(i);
            }
            }

        System.out.println(maxNum2);
    }
}
