package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(20);
        scores.add(30);
        scores.add(10);

        int a = scores.get(2);
        double b = scores.get(2);

        System.out.println(a);
        System.out.println(b);
        System.out.println("><><><><><><><><><><><><><><");
        System.out.println();

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);

        int maxNum = Integer.MIN_VALUE;
        for ( Integer each : array){

        }



    }
}
