package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);

        list.add(1,6);

        list.set(3,9);

        list.remove(2);

        System.out.println(list);
    }
}
