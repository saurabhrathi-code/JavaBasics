package java8Practice.practice2;

import java.util.*;
import java.util.stream.Collectors;

public class Que2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,3,2,1,4,5);
        HashSet<Integer> hashSet = new HashSet<>();
        integerList.stream().filter(x-> !hashSet.add(x)).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
