package Day24_Methods;

import java.util.Arrays;
import Resurses.Library;

public class Test {

    public static void main(String[] args) {

        String str = "CyberTek";

        String Restr = Library.Reverse(str);

        System.out.println(str.equalsIgnoreCase(Restr));

        int [] arr = { 1000, 3000, 2000, 4000, 5000, 100000};
        arr = Library.sortDescending(arr);
        System.out.println(Arrays.toString(arr));

    }


}
