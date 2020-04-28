package Day29_Wrapper_ArrayList;

import java.util.Arrays;

public class Value_of_Methods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);
        System.out.println(a);

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum3 = Byte.MIN_VALUE;
        System.out.println(minNum3);
        System.out.println("><><><><><><><><><><><><><><><><><");

        int [] arr = new int [3];
        System.out.println(Arrays.toString(arr));

        double [] arr2 = new double[3];
        System.out.println(Arrays.toString(arr2));
    }
}
