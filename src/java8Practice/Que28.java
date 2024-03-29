package java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que28 {
    public static void main(String[] args) {

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> collect = items.stream().sorted().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);

        collect.entrySet()
                .stream()
                 .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));


    }
}
