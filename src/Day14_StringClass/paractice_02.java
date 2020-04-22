package Day14_StringClass;

import java.util.Scanner;

public class paractice_02 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter the website");

        String webSite = data.next();
         webSite = webSite.toLowerCase();

        if (webSite.startsWith("www.")){
            System.out.println("Valid website");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
