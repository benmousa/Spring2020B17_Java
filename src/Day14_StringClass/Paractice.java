package Day14_StringClass;

import java.util.Scanner;

public class Paractice {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        String gmail = "Cybertekschool@gmail.com";

        String user = "CybertekSchool@gmail.com";

        boolean result = gmail.equals(user);

        if (result){
            System.out.println("Logged in");
        }
        else {
            System.out.println("Invalid");
        }
        System.out.println("================================");

        System.out.println("enter your password");
        String PassWord = data.nextLine();

        if (PassWord.contains(" ")){
            System.out.println("Password connot have space in it");
        }
        else{
            System.out.println("Valid password");
        }

    }
}
