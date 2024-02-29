package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que23 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("AA","BB", "AA","CC");

        long count = stringList.stream().count();
        System.out.println(count);

        Map<String, Long> collect = stringList.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);
    }
}
