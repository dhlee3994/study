package ch04.DateTime;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Exam01_LocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate myBirth = LocalDate.of(1993, 8, 17);
        System.out.println(today);
        System.out.println(today.getYear());       // 년도
        System.out.println(today.getMonth());      // 월(영어)
        System.out.println(today.getMonthValue()); // 월(숫자)
        System.out.println(today.getDayOfYear());  // 년의 몇번째 일
        System.out.println(today.getDayOfMonth()); // 월의 몇번째 일
        System.out.println(today.getDayOfWeek());  // 요일
        System.out.println(today.isLeapYear());    // 윤년여부
    }
}
