package ch04.DateTime;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class Exam03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime target = LocalDateTime.of(1992, 8, 17, 4, 20, 18, 4771);

        System.out.println(now);
        System.out.println(target);
    }
}
