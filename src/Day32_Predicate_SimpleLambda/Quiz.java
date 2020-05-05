package Day32_Predicate_SimpleLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Quiz {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(numbers);

        Predicate<Integer> remove3or5 = x -> x / 3 != 0 || x / 5 != 0;

        numbers.removeIf(remove3or5);
        System.out.println(numbers);
    }
}
