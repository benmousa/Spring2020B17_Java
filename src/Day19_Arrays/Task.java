package Day19_Arrays;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner data = new Scanner (System.in);

        System.out.println("Enter the day plaese");
        String day = data.next();

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednsday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        if (day.equalsIgnoreCase(days[0])){
            System.out.println("Today is Monday");
        }
        else if (day.equalsIgnoreCase(days[1])){
            System.out.println("Today is Tuesday");
        }






    }
}
