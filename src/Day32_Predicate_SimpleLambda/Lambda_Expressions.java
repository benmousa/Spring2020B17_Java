package Day32_Predicate_SimpleLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate <Integer> oddNum = x -> x %2 != 0;
        Integer[] arr =  {1,5,2,6,3,8,4,7,9,10};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

        list.removeIf(oddNum);
        System.out.println(list);
        System.out.println("><><><><><><><><><><><><><");

        Predicate <Integer> less7 = x -> x < 7;
        list.removeIf(less7);
        System.out.println(list);

        System.out.println("==========================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ali","Ali", "Medo", "Adel", "Ali"));
        System.out.println(names);

        Predicate<String> letter = x -> ! x.startsWith("M");
        names.removeIf(letter);
        System.out.println(names);

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        ArrayList<Integer> Numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Numbers);

        Numbers.removeIf(p -> p > 5);
        System.out.println(Numbers);



    }
}
