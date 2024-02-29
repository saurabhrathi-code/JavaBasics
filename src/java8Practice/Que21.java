package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Que21 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("ass","dqdqwd","dqqw","qwdd");

        Set<String> collect = stringList.stream().map(String::toUpperCase).collect(Collectors.toSet());// list to set
        // for practice

        System.out.println(collect);
    }
}
