package ch04.DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exam06_ChronoUnit {
    public static void main(String[] args) {
        LocalDate myBirth = LocalDate.of(1992, 8, 17);
        LocalDate today = LocalDate.of(2020, 6, 29);

        long month = ChronoUnit.MONTHS.between(myBirth, today);
        long week = ChronoUnit.WEEKS.between(myBirth, today);
        long day = ChronoUnit.DAYS.between(myBirth, today);

        System.out.println("Month : " + month);
        System.out.println("Week : " + week);
        System.out.println("Day : " + day);

        LocalTime startTime = LocalTime.of(21, 51, 10);
        LocalTime endTime = LocalTime.of(21,52,00);

        long hour = ChronoUnit.HOURS.between(startTime, endTime);
        long minute = ChronoUnit.MINUTES.between(startTime, endTime);
        long second = ChronoUnit.SECONDS.between(startTime, endTime);

        System.out.println("hour : " + hour);
        System.out.println("minute : " + minute);
        System.out.println("second : " + second);
    }
}
