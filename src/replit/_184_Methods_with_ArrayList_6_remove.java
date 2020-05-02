package replit;

import java.util.ArrayList;
import java.util.List;

public class _184_Methods_with_ArrayList_6_remove {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        list.add(6.0);
        list.add(2.6);
        list.add(3.45);
        list.add(1.4);
        list.add(9.6);
        list.add(7.7);
        list.add(5.7);

        System.out.println(list);

        test(list);

    }


    public static void test(ArrayList<Double> dubs) {


        double times = 2;
        while ( times > 0 ){
            for ( int i = 0; i < 1; i++){
                dubs.remove(i);
            }
            times--;
        }
        System.out.println(dubs);

    }

    }

