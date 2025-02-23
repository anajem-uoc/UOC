package edu.uoc.ds.adt;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateUtils {
    public static LocalDateTime getLocalDateTime(String dateStr) {
        return Instant.parse(dateStr)
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
