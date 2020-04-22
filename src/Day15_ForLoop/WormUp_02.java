package Day15_ForLoop;

import java.util.Scanner;

public class WormUp_02 {
    public static void main(String[] args) {
        /* Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"
         */

        Scanner data = new Scanner (System.in);

        System.out.println("Enter your Email");
        String email = data.nextLine();
        email = email.toLowerCase();

        System.out.println("Enter your PassWord");
        String password = data.nextLine();



        if (email.equals("cybertek.batch17@gmail.com") && password.equals("JavaBeauties")){
            System.out.println("Log in");
        }
        else if (!email.endsWith("@gmail.com")){
            System.out.println("It's not valid Email!");
        }
        else if (email.endsWith("@gmail.com") && !email.equals("cybertek.batch17@gmail.com")
                || email.endsWith("@gmail.com") && ! password.equals("JavaBeauties")){
            System.out.println("Invalid UserName or PassWord");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
