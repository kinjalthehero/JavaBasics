package dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateBasics {

    public static void main(String[] args) {

        // how to define a date or time
        System.out.println(LocalDate.of(2016, Month.NOVEMBER, 8));
        System.out.println(LocalDate.of(2016,12,01));
        System.out.println(LocalTime.of(3, 20, 55));
        System.out.println(LocalDateTime.of(2020, 4, 3, 12, 33, 45));

        // get current date and time
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        // get current date, month or year
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalTime.now().getSecond());
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getMinute());

        // add or remove time
        System.out.println(LocalDateTime.now().minusMinutes(5));
        System.out.println(LocalDateTime.now().minusHours(5));
        System.out.println(LocalDateTime.now().minusSeconds(5));
        System.out.println(LocalDateTime.now().plusMinutes(5));
        System.out.println(LocalDateTime.now().plusHours(5));
        System.out.println(LocalDateTime.now().plusSeconds(5));

        // format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));
    }
}