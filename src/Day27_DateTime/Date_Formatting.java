package Day27_DateTime;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatting {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd/yyyy");


        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(dtf));

        System.out.println("><><><><><><><><><><><><><><");
        LocalDate biethDay = LocalDate.of(1982,01,20);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MMMM dd/yyyy");

        System.out.println(biethDay.format(dtf2));
    }
}