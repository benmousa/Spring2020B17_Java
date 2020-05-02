package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        LocalDate Birthday = LocalDate.of(2000, 05,28);

        LocalDate Now = LocalDate.now();

        String str = Now.toString();

        System.out.println(str.replace("-","/"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate now = LocalDate.now();
        System.out.println(now.format(dtf));

        System.out.println("===============================");

        LocalDate date2 = LocalDate.of (2020,10,01);

        LocalDate Birthhday = LocalDate.of (2000, 12,02);

        boolean leap = date2.isLeapYear();
        System.out.println(leap);

        boolean result1 = date2.isAfter(Birthhday);
        System.out.println(result1);

        boolean result2 = Birthhday.isAfter(date2);
        System.out.println(result2);

        LocalDate now2 = LocalDate.now();
        System.out.println("Today is: "+now2);

        String str2 = now2.toString();
        str2 = str2.replace("-","/");

        System.out.println(str2);

    }
}
