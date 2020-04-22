package Day20_ArraysContinue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1 = {9, 8,7,6,5,4,3,2,1, 19,-1,300};

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("Fist num is "+arr1[0]);

        System.out.println("Second num is "+arr1[1]);

        System.out.println("Fisrt max num is "+arr1[arr1.length-1]);
        System.out.println("Second max num is "+arr1[arr1.length-2]);

        char[] ch = {'A', 'D', 'Z','B', 'E'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

        String[] names = {"Deniz", "Osman", "Rustem", "Ali"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("*****************************************");


        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr);

        int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));
        System.out.println();

        int j = 0;

        for(int i = arr.length -1;  i >= 0; i--){
            // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr[i];

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));


    }
}
