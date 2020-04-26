package Day28_DateTime;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);

        LocalDateTime dt2 = LocalDateTime.of(1984,5,28,11,25,30);
        System.out.println(dt2);
    }
}
