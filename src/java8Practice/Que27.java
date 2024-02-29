package java8Practice;

import java.util.stream.Stream;

public class Que27 {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("AB", "CD", "DE", null, "RF", null, "CD");

        stringStream.filter(s-> s != null).forEach(System.out::println);

    }
}
