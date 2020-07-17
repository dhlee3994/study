package ch04.DateTime;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class Exam02_LocalTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime time = LocalTime.of(10, 59, 20, 111);

        System.out.println(currentTime);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }
}
