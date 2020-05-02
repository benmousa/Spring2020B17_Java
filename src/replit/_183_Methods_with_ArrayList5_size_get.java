package replit;

import java.util.ArrayList;

public class _183_Methods_with_ArrayList5_size_get {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(2);
        ints.add(3);


        sum(ints);
    }

    public static int sum(ArrayList<Integer> ints){

        int sum = 0;
        for ( int i = 0; i <= ints.size()-1; i++){
            sum += ints.get(i);
        }
        System.out.println(sum);
        return sum ;
    }
}
