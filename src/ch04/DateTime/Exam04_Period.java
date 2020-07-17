package ch04.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exam04_Period {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate myBirth = LocalDate.of(1992, 8, 17);
        Period myPeriod = Period.between(myBirth, now);

        System.out.println(myPeriod);
        System.out.println(myPeriod.getYears());
        System.out.println(myPeriod.getMonths());
        System.out.println(myPeriod.getDays());

        Period period = Period.parse("P10Y5M12D");
        System.out.println(period);
    }
}
