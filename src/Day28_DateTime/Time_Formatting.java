package Day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class Time_Formatting {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(13,30);
        System.out.println(time);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss ");
        String str = time.toString();

        System.out.println(time.format(dtf));



    }
}
