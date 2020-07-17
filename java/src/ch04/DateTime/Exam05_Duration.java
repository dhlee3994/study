package ch04.DateTime;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalTime;

public class Exam05_Duration {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(1, 50, 10, 100);
        LocalTime end = LocalTime.of(1, 50, 50, 300);

        Duration duration = Duration.between(start, end);

        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());

        Duration day = Duration.ofDays(1);
        Duration hour = Duration.ofHours(1);
        Duration minute = Duration.ofMinutes(1);

        System.out.printf("하루는 %d초 입니다.\n", day.getSeconds());
        System.out.printf("1시간은 %d초 입니다.\n", hour.getSeconds());
        System.out.printf("1분은 %d초 입니다.\n", minute.getSeconds());


    }
}
