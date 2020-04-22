package Day15_ForLoop;

public class WormUp_03 {
    public static void main(String[] args) {
        /*
        write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */

        String str = "Java";
               //     0123
        //String str2 = str.substring() ;

        char str3 = str.charAt(3) ;
        char  str4 = str.charAt(2);
        char str5 = str.charAt(1);
        char str6 = str.charAt(0);
        String result1 = str.substring(3) + str.substring(2,3) + str.substring(1,2) + str.substring(0,1);

        String result = ""+str.charAt(3) +""+str.charAt(2) + ""+str.charAt(1) +""+str.charAt(0);

        System.out.println(str3+""+str4+""+str5+""+str6);
        System.out.println(result);
        System.out.println(result1);

        System.out.println("++++++++++++++++++++");

        String a = "abc";
        String b = "abc";

        System.out.println("a == b "+a == b);
    }
}
