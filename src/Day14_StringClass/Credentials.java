package Day14_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        String userName = new String("cybertek");
        String passWord = new String("cybertekschool");

        System.out.println("Please enter your UserName");
        String user = data.next();

        System.out.println("Please enter your PassWord");
        String pass = data.next();

        if (user.equals(userName) && pass.equals(passWord) ){
            System.out.println("Log in seccessfully");
        }
        else{
            System.out.println("invalid");
        }
    }


}
