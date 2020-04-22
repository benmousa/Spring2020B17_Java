package Day14_StringClass;

import java.util.Scanner;

public class credentials_02 {
    public static void main(String[] args) {
        /* userName = "cybertek";
         passWord = "cyberteckschool";

        if user entered both valid username and password  ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid user name, invalid password ==> password is incorrect
        if both password and username are invalied ==> invalid username and password
         */
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your UserName please");
        String yourUserName = data.next();
        yourUserName = yourUserName.toLowerCase();

        System.out.println("Enter your PassWord please");
        String yourPassWord = data.next();
        yourPassWord = yourPassWord.toLowerCase();

        String userName = new String("cybertek");
        String passWord = new String("cybertekschool");

      /*  if (yourUserName.equals(userName) && yourPassWord.equals(passWord)
                && !yourUserName.isEmpty() && !yourPassWord.isEmpty()){
            System.out.println("Log in");
        }
        else if(yourUserName.equals(userName) && ! yourPassWord.equals(passWord)){
            System.out.println("Your password is incorrect");
        }
        else if(! yourUserName.equals(userName) && yourPassWord.equals(passWord)){
            System.out.println("Your User name is incorrect");
        }
        else {
            System.out.println("Invalid");
        }*/

        boolean validUsername = ! yourPassWord.equals(passWord) && yourUserName.equals(userName);
        boolean validPassWord = yourPassWord.equals(passWord) && ! yourUserName.equals(userName);
        boolean logIn = yourPassWord.equals(passWord) && yourUserName.equals(userName)
                && !userName.isEmpty() && !passWord.isEmpty();

        if(logIn){
            System.out.println("Log in");
        }
        else if(validUsername){
            System.out.println("Your PassWord is incorrect");
        }
        else if(validPassWord){
            System.out.println("Your UserName is incorrect");
        }
        else{
            System.out.println("Invalid");
        }






    }

}
