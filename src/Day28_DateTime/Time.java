package Day28_DateTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime time2 = LocalTime.of(15,30,15);
        System.out.println(time2);
    }
}
