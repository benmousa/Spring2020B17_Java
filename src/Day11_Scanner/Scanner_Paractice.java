package Day11_Scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Scanner_Paractice {

    /* Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:

     */

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.println("Enter your first name please");
        String firstName = data.next();

        System.out.println("Please enter your last name");
        String lastName = data.next();

        System.out.println("Please if employeed enter \"True\" if not enter \"False\"");
        boolean employee = data.nextBoolean();

        double salary = 0;

        if (employee == true){
            System.out.println("Please enter your salary here");
             salary = data.nextDouble();
        }

        System.out.println("Your name is: "+firstName+" "+lastName);

        System.out.println("You are employeed: "+employee);

        System.out.println("Your salary is: $"+salary);





    }
}
