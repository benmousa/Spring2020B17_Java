package Day16_ForLoop_02;

import java.util.Scanner;

public class Wormup_07_Palindrome {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Please enter the name");
        String name = data.nextLine();

        String reversword = " ";

        for (int z = name.length()-1; z >= 0; z--){
                    reversword += name.charAt(z);
        }
        System.out.println(reversword);

       /* for (int z = 0 ; z <= 7 ; z++)
            System.out.print(name.charAt(z));

        for (int z2 = 0 ; z2 <= 0 ; z2--)
            System.out.print(name.charAt(z2));

        */


    }
}
