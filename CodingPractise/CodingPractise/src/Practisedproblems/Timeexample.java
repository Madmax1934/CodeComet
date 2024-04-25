package Practisedproblems;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Timeexample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//
//        // Specify the time zone you want to consider
        ZoneId zoneId = ZoneId.of("UTC"); // Replace with your desired time zone
//
//        // Convert LocalDateTime to ZonedDateTime in the specified time zone
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
//
//        // Get the equivalent Instant (in UTC)
//        ZonedDateTime utcDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));


        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("UTC Equivalent: " + zonedDateTime);
    }
}
