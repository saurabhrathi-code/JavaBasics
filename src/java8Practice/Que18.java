package java8Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Que18 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        String dateNow = localDateTime.format(dateTimeFormatter);
        System.out.println(dateNow);

    }
}
