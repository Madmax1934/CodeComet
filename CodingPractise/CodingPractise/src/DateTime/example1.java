package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class example1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);


        LocalTime lt1= LocalTime.now(java.time.ZoneId.of("Asia/Kolkata"));
        LocalTime lt2= LocalTime.now(java.time.ZoneId.of("Asia/Tokyo"));
        System.out.println(ChronoUnit.HOURS.between(lt1,lt2));

        //localdatatime

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

        //monthday
        System.out.println(MonthDay.now().range(ChronoField.DAY_OF_MONTH));

        //offset date and time
        System.out.println(OffsetTime.now().get(ChronoField.MINUTE_OF_DAY));
        System.out.println(OffsetDateTime.now().get(ChronoField.DAY_OF_YEAR));
    }


}
