package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Que19 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);

        integerList.stream()
                .map(x-> x*x*x)
                .filter(x-> x>50)
                .forEach(System.out::println);
    }
}
