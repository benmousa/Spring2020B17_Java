package Day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Emails {
    public static void main(String[] args) {

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for ( String eachEmail : emails ) {
            if (!eachEmail.endsWith("@gmail.com")) {
                System.out.println(eachEmail);
                continue;
            }
        }








    }
}
