package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Que2PointOne {
    public static void main(String[] args) {

        Integer [] integersArray = {1,1,1,2,2,3,4,5,6,7,8,9,0,6,4};

        List<Integer> integerList = Arrays.asList(integersArray);

        Map<Integer, Long> collect = integerList.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        collect.forEach(

                (key,value) -> {
                    if(value >1) {
                        System.out.println(key+":"+value);
                        System.out.println(key);
                    }
                }
        );
    }
}
