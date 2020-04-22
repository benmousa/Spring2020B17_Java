package replit;

import java.util.Scanner;

public class _079_String_no_end_String_method {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        txt = txt.replace(txt.substring(txt.length()-1,txt.length()), " ");

        System.out.println(txt);

                //m,o,h,a,m,m,e,d
               // 0,1,2,3,4,5,6,7,8

    }
}
