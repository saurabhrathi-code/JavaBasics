package java8Practice;

import java.util.stream.Stream;

//
public class Que12 {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("sam", "Tom", "nick");
        Stream<String> stringStream1 = Stream.of("ani","bani","tonny");

        Stream.concat(stringStream,stringStream1).forEach(System.out::println);

    }
}
