package Day25_Methods_Recap;

public class WormUp_02 {
    /*
    2. do the first task with multi-branch if statement instead of switch statement
     */
    public static String GetDriver1 (String browser){


        if ( browser.equalsIgnoreCase("Chrome")){
            return  "Chrome Driver";
        }
        else if ( browser.equalsIgnoreCase("faifox") ){
            return  "Fairfax Driver";
        }
        else if ( browser.equalsIgnoreCase("id") ){
            return  "IE Driver";
        }
        else if( browser.equalsIgnoreCase("safari")){
            return "Safari Driver";
        }
        else if ( browser.equalsIgnoreCase("edge")){
            return "Edge Driver";
        }
        else if (browser.equalsIgnoreCase("opera")){
            return  "Opera Driver";
        }
        else{
            return "Invalid Driver";
        }
    }

    public static void main(String[] args) {

        String str = GetDriver1("oPEra");
        System.out.println(str);
    }
}

