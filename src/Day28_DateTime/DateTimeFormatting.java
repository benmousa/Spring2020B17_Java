package Day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2015,12,25,11,30,45);
        System.out.println(dt);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MM/dd hh:mm a");
        System.out.println(dt.format(dtf));
    }
}
