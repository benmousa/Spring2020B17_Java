package Day11_Scanner;

public class WarmUp_02 {

    public static void main(String[] args) {
        /* write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
         */

        String browserName = "fairfox";

        switch (browserName){
            case "chrome":
                System.out.println("chrome is opining ...");
                break;

            case "fairfox":
                System.out.println("fairfox is opening ...");
                break;

            case "opera":
                System.out.println("oper is opening ...");
                break;

            case "safari":
                System.out.println("safari is opening ...");

            default:
                System.out.println("Invalid browser name");

        }
    }
}
