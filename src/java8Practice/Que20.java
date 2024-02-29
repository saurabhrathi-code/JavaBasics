package java8Practice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Que20 {
    public static void main(String[] args) {

//        int [] intArray = {7,5,2,6,9,5,2,6,8};
//
//        Stream<Integer> collect = Arrays.stream(intArray).sorted().boxed().collect(Collectors.toList()).stream();

        String[] stringsArray = {"xyz", "abc", "cvm", "cbx"};

        Stream<String> stream = Arrays.stream(stringsArray).sorted().collect(Collectors.toList()).stream();
        stream.forEach(System.out::println);
    }
}
