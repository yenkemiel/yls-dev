/*
 * Day07 - Date / LocalDate / LocalDateTime
 * 
 * 學習重點：
 * 1. Date (舊版時間 API)
 * 2. LocalDate
 * 3. LocalDateTime
 * 4. 日期加減
 * 5. 日期格式化
 * 6. 日期時間比較
 */

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day07DateTimeDemo {

    public static void main(String[] args) {

        // 1. Date (舊版時間 API)

        Date date = new Date();
        System.out.println("現在日期: " + date);

        System.out.println("毫秒數: " + date.getTime());

        System.out.println(System.currentTimeMillis());


        // 2. LocalDate

        LocalDate today = LocalDate.now();
        System.out.println("今天日期: " + today);

        LocalDate specificDate = LocalDate.of(2024, 8, 18);
        System.out.println("指定日期: " + specificDate);


        // 2.1 取得年月日

        LocalDate date2 = LocalDate.of(2024, 8, 18);

        int year = date2.getYear();
        int month = date2.getMonthValue();
        int day = date2.getDayOfMonth();

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);


        // 3. LocalDateTime

        LocalDateTime dateTime1 =
                LocalDateTime.of(2024, 8, 18, 14, 30);

        LocalDateTime dateTime2 =
                LocalDateTime.of(2024, 8, 19, 14, 30);

        if (dateTime1.isBefore(dateTime2)) {
            System.out.println("dateTime1 在 dateTime2 之前");
        } else if (dateTime1.isAfter(dateTime2)) {
            System.out.println("dateTime1 在 dateTime2 之後");
        } else {
            System.out.println("相同時間");
        }


        // 4. 日期加減

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println("明天: " + tomorrow);

        LocalDateTime lastHour = now.minusHours(1);
        System.out.println("一小時前: " + lastHour);


        // 5. 日期格式化

        LocalDate today2 = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate =
                today2.format(formatter);

        System.out.println("格式化日期: " + formattedDate);


        // 6. 取得現在時間

        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("現在時間: " + nowTime);


        // 6.1 比較日期時間

        LocalDateTime dt1 =
                LocalDateTime.of(2024, 8, 18, 14, 30);

        LocalDateTime dt2 =
                LocalDateTime.of(2024, 8, 19, 14, 30);

        if (dt1.isBefore(dt2)) {

            System.out.println(dt1 + " 在 " + dt2 + " 之前");

        } else if (dt1.isAfter(dt2)) {

            System.out.println(dt1 + " 在 " + dt2 + " 之後");

        } else {

            System.out.println(dt1 + " 和 " + dt2 + " 是同一時間");

        }

    }
}