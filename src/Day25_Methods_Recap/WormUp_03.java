package Day25_Methods_Recap;

public class WormUp_03 {
    /*
    3. do the first task with ternaries instead of switch statements
     */

    public static String GetDriver1 (String browser){

        return  ( browser.equalsIgnoreCase("Chrome"))? "Chrome Driver"
                : ( browser.equalsIgnoreCase("faifox"))? "Fairfax Driver"
                : ( browser.equalsIgnoreCase("ie"))? "IE Driver"
                : ( browser.equalsIgnoreCase("safari"))? "Safari Driver"
                : ( browser.equalsIgnoreCase("edge"))? "Edge Driver"
                : (browser.equalsIgnoreCase("opera"))? "Opera Driver"
                : "Invalid Driver";

    }

    public static void main(String[] args) {
        String str = GetDriver1("SaFari");
        System.out.println(str);
    }
}

