package ch04.DateTime;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exam07_Casting {
    final static LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(2020, 6, 29, 21, 55, 10);
    final static LocalDate LOCAL_DATE = LocalDate.of(2020, 6, 29);
    final static LocalTime LOCAL_TIME = LocalTime.of(21, 55, 10);

    public static void main(String[] args) {
        // LocalDateTime & String
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        String dateTimeString = "1992-08-17T04:12:46.332342";

        String ldtToString = LOCAL_DATE_TIME.format(dateTimeFormatter);
        System.out.println("LocalDateTime to String : " + ldtToString +  ", " + ldtToString.getClass().getName());

        LocalDateTime stringToLdt = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("String to LocalDateTimme : " + stringToLdt +  ", " + stringToLdt.getClass().getName());

        System.out.println("-------------------------------------------------------------------");
        // LocalDate & String
        DateTimeFormatter dateFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String dateString = "1992-08-17";

        String ldToString = LOCAL_DATE.format(dateFormatter);
        System.out.println("LocalDate to String : " + ldToString +  ", " + ldToString.getClass().getName());


        LocalDate stringToLd = LocalDate.parse(dateString);
        System.out.println("String to LocalDate : " + stringToLd +  ", " + stringToLd.getClass().getName());

        System.out.println("-------------------------------------------------------------------");
        // LocalTime & String
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm.ss.SSS");
        String timeString = "23:02:19.235";

        String ltToString = LOCAL_TIME.format(timeFormatter);
        System.out.println("LocalTime to String : " + ltToString +  ", " + ltToString.getClass().getName());

        LocalTime stringToLt = LocalTime.parse(timeString);
        System.out.println("String to LocalTime : " + stringToLt + ", " + stringToLt.getClass().getName());

        System.out.println("-------------------------------------------------------------------");
        // LocalDateTime & java.util.Date
        java.util.Date ldtToUtilDate = java.util.Date.from(LOCAL_DATE_TIME.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("LocalDateTime to util.Date : " + ldtToUtilDate + ", " + ldtToUtilDate.getClass().getName());

        LocalDateTime utilDateToLdt = LocalDateTime.ofInstant(new java.util.Date(2020, 6, 29, 22, 00 , 16).toInstant(), ZoneId.systemDefault());
        System.out.println("util.Date to LocalDateTime : " + utilDateToLdt + ", " + utilDateToLdt.getClass().getName());

        System.out.println("-------------------------------------------------------------------");
        // LocalDateTIme & java.sql.Timestamp
        Timestamp ldtToTimestamp = Timestamp.valueOf(LOCAL_DATE_TIME);
        System.out.println("LocalDateTime to Timestamp : " + ldtToTimestamp + ", " + ldtToTimestamp.getClass().getName());

        LocalDateTime timestampToLdt = new Timestamp(2020, 6, 29, 22, 15, 24, 5312).toLocalDateTime();
        System.out.println("Timestamp to LocalDateTime : " + timestampToLdt + ", " + timestampToLdt.getClass().getName());

        System.out.println("-------------------------------------------------------------------");
        // LocalDate & java.sql.Date
        java.sql.Date ldToSqlDate = java.sql.Date.valueOf(LOCAL_DATE);
        System.out.println("LocalDate to sql.Date : " + ldToSqlDate + ", " + ldToSqlDate);

        LocalDate sqlDatetoLd = new Date(2020, 6, 29).toLocalDate();
        System.out.println("sql.Date to LocalDate : " + sqlDatetoLd + ", " + sqlDatetoLd);

        System.out.println("-------------------------------------------------------------------");
        // LocalDateTime & LocalDate
        LocalDate ldtToLd = LocalDate.from(LOCAL_DATE_TIME);
        System.out.println("LocalDateTime to LocalDate : " + ldtToLd +  ", " + ldtToLd.getClass().getName());

        LocalDateTime ldToLdt = LOCAL_DATE.atTime(1, 45, 30, 49782);
        System.out.println("LocalDate to LocalDateTime : " + ldToLdt +  ", " + ldToLdt.getClass().getName());
    }
}
