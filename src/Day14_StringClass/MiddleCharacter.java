package Day14_StringClass;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your word");
        String str = data.next();

        String middleCharactar = " ";

        int totalCharactar = str.length();
        int middleNum = totalCharactar / 2 ;

        if (totalCharactar %2 != 0 ) {
            middleCharactar += str.charAt(middleNum);
        }
        else{
            middleCharactar+= str.charAt(middleNum-1)+""+str.charAt(middleNum) ;
        }
        System.out.println(middleCharactar);




    }
}
