package java8Practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Que26 {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024,02,10);
        LocalDate endDate = LocalDate.now();

        long between = ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println(between);
    }
}
