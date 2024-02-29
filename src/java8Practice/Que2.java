package java8Practice;

import java.util.*;

//2. Write a program to print duplicate numbers.
public class Que2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,2,3,1,7,12,2);

        HashSet<Integer> integerHashSet = new HashSet<>();

        integerList.stream()
                .filter(n-> !integerHashSet.add(n)) .sorted(Comparator.reverseOrder()).distinct()
                .forEach(System.out::println);
    }
}
