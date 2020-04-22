package Day25_Methods_Recap;

public class WormUp_01_Driver {
    /*
 Warm up tasks:
1. write a return method named getDriver1 that accepts a string parameter called Browser
         if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
             Ex: getDriver("chrome");  ==> "Chrome Driver"
                 getDriver("fireFOX"); ==> "FireFox Driver"
                     ....
         if the browser name does not match with any of browsers above, the method should return "Invalid"
         APPLY SWITCH STATEMENTS
2. do the first task with multi-branch if statement instead of switch statement
3. do the first task with ternaries instead of switch statements
  */

    public static void main(String[] args) {

        String str = GetDriver2("CyBer");
        System.out.println(str);

    }
    public static String GetDriver2(String Browser2) {


        switch (Browser2.toLowerCase()) {
            case "chrome":
               return "Chrome Driver";

            case "fairfox":
                return  "FairFox Driver";

            case "IE":
                return  "IE Driver";

            case "safari":
                return  "Safari Driver";

            case "edge":
                return  "Edge Driver";

            case "opera":
                return  "Opera Driver";

            default:
                return  "Invalid Driver";
        }
    }
}
