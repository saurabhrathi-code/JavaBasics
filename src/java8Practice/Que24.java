package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Que24 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("ABC","DSF","kwqdb");

        Optional.ofNullable(stringList).filter(s -> !(s.isEmpty())).ifPresent(s->s.forEach(System.out::println));
    }
}
