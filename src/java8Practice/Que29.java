package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Que29 {
    public static void main(String[] args) {

        int [] primitiveIntArray = {1,2,3,4,5,6};

        List<Integer> collect = Arrays.stream(primitiveIntArray).boxed().collect(Collectors.toList());
        System.out.println(collect);


    }
}
