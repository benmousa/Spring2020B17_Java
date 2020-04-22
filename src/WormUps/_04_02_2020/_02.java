package WormUps._04_02_2020;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);
        System.out.println("Enter your User Name");
        String userName = data.next();

        System.out.println("Enter your Pass Word");
        String passWord = data.next();

        String user = "cybertek.batch17@gmail.com";
        String pass = "JavaBeauties";

        if ( ! userName.endsWith("gmail.com")){
            System.out.println("it's not a valid email");
        }
        if ( ! userName.equalsIgnoreCase(user) || ! passWord.equals(pass)){
            System.out.println("invalid username or password");
        }
        if ( userName.equalsIgnoreCase(user) || passWord.equals(pass)){
            System.out.println("Logged in");
    }
}}
