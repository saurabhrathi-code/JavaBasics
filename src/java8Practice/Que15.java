package java8Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Que15 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,1,3,4,5,6,10);

        List<String> stringList = Arrays.asList("Apple","Apple","Orange","Mango","Banana","Apple","Banana","Mango",
                "Grapes");

/*        HashSet<Integer> integerHashSet = new HashSet<>();
        Map<Integer, Long> collect =
                integerList.stream().filter(s -> !(integerHashSet.add(s))).collect(Collectors.groupingBy(s->s,
                        Collectors.counting()));
        collect.entrySet().forEach((k -> System.out.println(k.getKey()+":"+ k.getValue())));*/

/*        Map<Integer, Long> collect = integerList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() > 1)
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));

        System.out.println(collect);*/

   /*     Map<String, Long> collect = stringList.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));

        System.out.println(collect);
*/

        Set<String> stringSet = new HashSet<>();
        Map<String, Long> collect = stringList.stream()
                .filter(s -> !(stringSet.add(s)))
                .sorted()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(collect);

    }
}
